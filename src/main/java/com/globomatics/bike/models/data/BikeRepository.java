package com.globomatics.bike.models.data;

import com.globomatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends JpaRepository <Bike, Long>{

}
