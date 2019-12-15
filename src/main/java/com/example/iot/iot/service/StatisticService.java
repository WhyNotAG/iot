package com.example.iot.iot.service;

import com.example.iot.iot.domain.Statistic;

import java.util.List;

public interface StatisticService {
    List<Statistic> findAll();
    Statistic findById(Long id);
    Statistic findLast();
    Statistic save(Statistic statistic);
}
