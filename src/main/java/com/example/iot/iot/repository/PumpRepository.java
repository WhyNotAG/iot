package com.example.iot.iot.repository;

import com.example.iot.iot.domain.Pump;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PumpRepository extends JpaRepository<Pump, Long> {
}
