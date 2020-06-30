package com.github.nata01.smartgreenhouse.planttype;

import com.github.nata01.smartgreenhouse.family.FamilyDto;
import lombok.Getter;

@Getter
public class PlantTypeDto {

    private final long id;
    private final FamilyDto family;
    private final String title;

    public PlantTypeDto(PlantType plantType) {
        this.id = plantType.getId();
        this.family = new FamilyDto(plantType.getFamily());
        this.title = plantType.getTitle();
    }
}
