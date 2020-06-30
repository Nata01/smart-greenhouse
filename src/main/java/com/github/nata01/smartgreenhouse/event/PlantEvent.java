package com.github.nata01.smartgreenhouse.event;

import com.github.nata01.smartgreenhouse.plant.Plant;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Entity
@Getter
@Setter
public class PlantEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private EventType eventType;

    private Instant eventTime;

    private Instant createdAt;

    @ManyToMany(mappedBy = "events")
    private Set<Plant> plants;
}
