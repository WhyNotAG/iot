package com.example.iot.iot.service.impl;

import com.example.iot.iot.domain.Pump;
import com.example.iot.iot.repository.PumpRepository;
import com.example.iot.iot.service.PumpService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PumpServiceImpl implements PumpService {
    private PumpRepository pumpRepository;

    public PumpServiceImpl(PumpRepository pumpRepository) {
        this.pumpRepository = pumpRepository;
    }

    @Override
    public Pump update(Long id) {
        Pump pump = pumpRepository.findById(id).orElse(null);
        pump.setActive(!pump.getActive());
        return pumpRepository.save(pump);
    }

    @Override
    public List<Pump> getAll() {
        return pumpRepository.findAll();
    }
}
