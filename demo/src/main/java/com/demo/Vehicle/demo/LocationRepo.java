package com.demo.Vehicle.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
public interface LocationRepo extends JpaRepository<LocationPojo, Integer> {

}