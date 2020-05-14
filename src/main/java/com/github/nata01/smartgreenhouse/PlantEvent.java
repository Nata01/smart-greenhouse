package com.github.nata01.smartgreenhouse;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity

@Getter
@Setter
public class PlantEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "events")
    private Set<Plant> plants;
}
