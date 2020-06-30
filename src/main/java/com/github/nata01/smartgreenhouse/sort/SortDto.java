package com.github.nata01.smartgreenhouse.sort;

import com.github.nata01.smartgreenhouse.planttype.PlantTypeDto;
import lombok.Getter;

@Getter
public class SortDto {

    private final Long id;
    private final String title;
    private final PlantTypeDto plantType;

    public SortDto(Sort sort) {
        this.id = sort.getId();
        this.title = sort.getTitle();
        this.plantType = new PlantTypeDto(sort.getPlantType());
    }
}
