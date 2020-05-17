package com.github.nata01.smartgreenhouse;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Soil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String composition;

//    @OneToMany(mappedBy = "soil")
//    private Set<Plant> plants;
}
