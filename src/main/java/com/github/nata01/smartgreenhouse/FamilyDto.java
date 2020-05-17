package com.github.nata01.smartgreenhouse;

import lombok.Getter;

@Getter
public class FamilyDto {

    private long id;
    private String title;

    public FamilyDto(Family family) {
        this.id = family.getId();
        this.title = family.getTitle();
    }
}
