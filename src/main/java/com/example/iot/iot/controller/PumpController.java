package com.example.iot.iot.controller;

import com.example.iot.iot.domain.Pump;
import com.example.iot.iot.service.PumpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pump")
@CrossOrigin
public class PumpController {
    private PumpService pumpService;

    public PumpController(PumpService pumpService) {
        this.pumpService = pumpService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Pump>> findAll() {
        return ResponseEntity.ok().body(pumpService.getAll());
    }

    @GetMapping("/update/{id}")
    public ResponseEntity<Pump> changeFirst(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(pumpService.update(id));
    }
}
