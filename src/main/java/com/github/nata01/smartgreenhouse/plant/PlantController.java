package com.github.nata01.smartgreenhouse.plant;

import com.github.nata01.smartgreenhouse.sort.SortRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/api/plants")
public class PlantController {

    private PlantRepository plantRepository;
    private SortRepository sortRepository;

    @GetMapping
    public List<PlantDto> getAll() {
        return plantRepository.findAll().stream().map(PlantDto::new).collect(Collectors.toList());
    }

    @PostMapping
    public PlantDto create(@RequestBody CreatePlantCommand plantCommand) {
        Plant plant = new Plant();
        plant.setLabel(plantCommand.getLabel());
        plant.setSort(sortRepository.getOne(plantCommand.getSortId()));
        plant.setCreatedAt(Instant.now());
        plant.setDateOfBirth(plantCommand.getDateOfBirth());

        return new PlantDto(plantRepository.save(plant));
    }
}
