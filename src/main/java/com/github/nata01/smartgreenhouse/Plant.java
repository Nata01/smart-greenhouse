package com.github.nata01.smartgreenhouse;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Getter
@Setter
@Entity
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private PlantType type;

    private Instant createdAt;

    private Instant dateOfBirth;

    @ManyToMany
    private Set<PlantEvent> events;
}