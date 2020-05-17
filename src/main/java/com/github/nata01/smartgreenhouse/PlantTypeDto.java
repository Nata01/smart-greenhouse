package com.github.nata01.smartgreenhouse;

import lombok.Getter;

@Getter
public class PlantTypeDto {

    private final long id;
    private final FamilyDto family;
    private final String title;

    PlantTypeDto(PlantType plantType) {
        this.id = plantType.getId();
        this.family = new FamilyDto(plantType.getFamily());
        this.title = plantType.getTitle();
    }
}
