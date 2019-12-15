package com.example.iot.iot.controller;

import com.example.iot.iot.domain.Statistic;
import com.example.iot.iot.service.StatisticService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/statistic")
@CrossOrigin
public class StatisticController {
    private StatisticService statisticService;

    public StatisticController(StatisticService statisticService) {
        this.statisticService = statisticService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Statistic>> findAll() {
        return ResponseEntity.ok().body(statisticService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Statistic> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(statisticService.findById(id));
    }

    @GetMapping("/last")
    public ResponseEntity<Statistic> findLast() {
        return ResponseEntity.ok().body(statisticService.findLast());
    }

    @PostMapping("/")
    public ResponseEntity<Statistic> save(@RequestBody Statistic statistic) {
        return ResponseEntity.ok().body(statisticService.save(statistic));
    }
}
