package com.github.nata01.smartgreenhouse.plant;


import com.github.nata01.smartgreenhouse.event.PlantEvent;
import com.github.nata01.smartgreenhouse.sort.Sort;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;

    @ManyToOne(optional = false)
    private Sort sort;

    private Instant createdAt;

    private Instant dateOfBirth;

    @ManyToMany
    private Set<PlantEvent> events = new HashSet<>();

//    @ManyToOne(optional = false)
//    private Soil soil;
}
