package com.globomatics.bike.models.data;

import com.globomatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository <Bike, Long>{

}
