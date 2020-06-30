package com.github.nata01.smartgreenhouse.sort;

import com.github.nata01.smartgreenhouse.plant.Plant;
import com.github.nata01.smartgreenhouse.planttype.PlantType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Sort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "sort")
    private Set<Plant> plants = new HashSet<>();

    @ManyToOne(optional = false)
    private PlantType plantType;
}
