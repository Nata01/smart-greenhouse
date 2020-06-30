package com.github.nata01.smartgreenhouse;

import com.github.nata01.smartgreenhouse.family.Family;
import com.github.nata01.smartgreenhouse.family.FamilyRepository;
import com.github.nata01.smartgreenhouse.planttype.PlantType;
import com.github.nata01.smartgreenhouse.planttype.PlantTypeRepository;
import com.github.nata01.smartgreenhouse.sort.Sort;
import com.github.nata01.smartgreenhouse.sort.SortRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AllArgsConstructor
public class DbSeed {

    private PlantTypeRepository plantTypeRepository;
    private FamilyRepository familyRepository;
    private SortRepository sortRepository;

    @PostConstruct
    public void postInit() {
        Family cucurbitaceae = new Family();
        cucurbitaceae.setId(1L);
        cucurbitaceae.setTitle("Cucurbitaceae");
        familyRepository.save(cucurbitaceae);

        PlantType cucumber = new PlantType();
        cucumber.setId(1L);
        cucumber.setTitle("Cucumber");
        cucumber.setFamily(cucurbitaceae);
        plantTypeRepository.save(cucumber);

        Sort alyonkaF1 = new Sort();
        alyonkaF1.setId(1L);
        alyonkaF1.setPlantType(cucumber);
        alyonkaF1.setTitle("Алёнка F1");
        sortRepository.save(alyonkaF1);

        Family solanaceae = new Family();
        solanaceae.setId(2L);
        solanaceae.setTitle("Solanaceae");
        familyRepository.save(solanaceae);

        PlantType tomato = new PlantType();
        tomato.setId(2L);
        tomato.setTitle("Tomato");
        tomato.setFamily(solanaceae);
        plantTypeRepository.save(tomato);

        Sort sanka = new Sort();
        sanka.setId(2L);
        sanka.setPlantType(tomato);
        sanka.setTitle("Санька");
        sortRepository.save(sanka);
    }
}
