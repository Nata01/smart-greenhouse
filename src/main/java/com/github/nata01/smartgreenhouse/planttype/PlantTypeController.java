package com.github.nata01.smartgreenhouse.planttype;

import com.github.nata01.smartgreenhouse.family.FamilyRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/api/plant-types")
public class PlantTypeController {

    private PlantTypeRepository plantTypeRepository;
    private FamilyRepository familyRepository;

    @GetMapping
    public List<PlantTypeDto> getAll(){
        return plantTypeRepository.findAll().stream().map(PlantTypeDto::new).collect(Collectors.toList());
    }

    @PostMapping
    public PlantTypeDto create(@RequestBody CreatePlantTypeCommand createPlantTypeCommand){
        PlantType plantType = new PlantType();
        plantType.setFamily(familyRepository.getOne(createPlantTypeCommand.getFamilyId()));
        plantType.setTitle(createPlantTypeCommand.getTitle());

        return new PlantTypeDto(plantTypeRepository.save(plantType));
    }
}
