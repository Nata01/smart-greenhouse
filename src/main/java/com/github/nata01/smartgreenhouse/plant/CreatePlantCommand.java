package com.github.nata01.smartgreenhouse.plant;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class CreatePlantCommand {

    private String label;
    private long sortId;
    private Instant dateOfBirth;
}
