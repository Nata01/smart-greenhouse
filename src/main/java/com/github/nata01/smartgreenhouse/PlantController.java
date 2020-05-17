package com.github.nata01.smartgreenhouse;

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
    private PlantTypeRepository plantTypeRepository;

    @GetMapping
    public List<PlantDto> getAll() {
        return plantRepository.findAll().stream().map(PlantDto::new).collect(Collectors.toList());
    }

    @PostMapping
    public PlantDto create(@RequestBody CreatePlantCommand plantCommand) {
        Plant plant = new Plant();
        plant.setSort(plantCommand.getSort());
        plant.setType(plantTypeRepository.getOne(plantCommand.getPlantTypeId()));
        plant.setCreatedAt(Instant.now());
        plant.setDateOfBirth(plantCommand.getDateOfBirth());

        return new PlantDto(plantRepository.save(plant));
    }
}
