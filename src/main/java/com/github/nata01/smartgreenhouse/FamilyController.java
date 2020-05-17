package com.github.nata01.smartgreenhouse;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/api/families")
public class FamilyController {

    private FamilyRepository familyRepository;

    @GetMapping
    public List<FamilyDto> getAll(){
        return familyRepository.findAll().stream().map(FamilyDto::new).collect(Collectors.toList());
    }

    @PostMapping
    public FamilyDto create(@RequestBody CreateFamilyCommand createFamilyCommand){
        Family family = new Family();
        family.setTitle(createFamilyCommand.getTitle());

        return new FamilyDto(familyRepository.save(family));
    }
}
