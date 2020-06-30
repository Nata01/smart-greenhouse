package com.github.nata01.smartgreenhouse.plant;

import com.github.nata01.smartgreenhouse.sort.SortDto;
import lombok.Getter;

import java.time.Instant;

@Getter
public class PlantDto {

    private final long id;
    private final Instant createdAt;
    private final Instant dateOfBirth;
    private final SortDto sort;

    public PlantDto(Plant plant) {
        this.id = plant.getId();
        this.createdAt = plant.getCreatedAt();
        this.dateOfBirth = plant.getDateOfBirth();
        this.sort = new SortDto(plant.getSort());
    }
}
