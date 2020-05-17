package com.github.nata01.smartgreenhouse;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreatePlantTypeCommand {

    long familyId;
    String title;
}
