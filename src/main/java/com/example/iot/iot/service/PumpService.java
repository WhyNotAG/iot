package com.example.iot.iot.service;

import com.example.iot.iot.domain.Pump;

import java.util.List;

public interface PumpService {
    Pump update(Long id);
    List<Pump> getAll();
}
