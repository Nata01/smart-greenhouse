package com.github.nata01.smartgreenhouse.plant;

import com.github.nata01.smartgreenhouse.plant.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
