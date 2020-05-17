package com.github.nata01.smartgreenhouse;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AllArgsConstructor
public class DbSeed {

    private PlantTypeRepository plantTypeRepository;
    private FamilyRepository familyRepository;

    @PostConstruct
    public void postInit() {
        Family family = new Family();
        family.setId(1L);
        family.setTitle("Cucurbitaceae");
        Family cucurbitaceae = familyRepository.save(family);

        PlantType cucumber = new PlantType();
        cucumber.setId(1L);
        cucumber.setTitle("Cucumber");
        cucumber.setFamily(cucurbitaceae);
        plantTypeRepository.save(cucumber);

        Family family1 = new Family();
        family1.setId(2L);
        family1.setTitle("Solanaceae");
        Family solanaceae = familyRepository.save(family1);

        PlantType tomato = new PlantType();
        tomato.setId(2L);
        tomato.setTitle("Tomato");
        tomato.setFamily(solanaceae);
        plantTypeRepository.save(tomato);
    }
}
