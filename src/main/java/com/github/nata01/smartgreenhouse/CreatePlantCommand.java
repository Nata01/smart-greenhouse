package com.github.nata01.smartgreenhouse;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class CreatePlantCommand {

    private long plantTypeId;
    private String sort;
    private Instant dateOfBirth;
}
