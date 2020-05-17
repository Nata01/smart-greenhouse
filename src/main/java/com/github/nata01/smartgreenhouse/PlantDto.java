package com.github.nata01.smartgreenhouse;

import lombok.Getter;

import java.time.Instant;

@Getter
public class PlantDto {

    private final long id;
    private final Instant createdAt;
    private final Instant dateOfBirth;
    private final String sort;
    private final PlantTypeDto plantType;

    public PlantDto(Plant plant) {
        this.id = plant.getId();
        this.createdAt = plant.getCreatedAt();
        this.dateOfBirth = plant.getDateOfBirth();
        this.sort = plant.getSort();
        this.plantType = new PlantTypeDto(plant.getType());
    }
}
