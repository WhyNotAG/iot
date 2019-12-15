package com.example.iot.iot.service.impl;

import com.example.iot.iot.domain.Statistic;
import com.example.iot.iot.repository.StatisticRepository;
import com.example.iot.iot.service.StatisticService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticServiceImpl implements StatisticService {
    private StatisticRepository statisticRepository;

    public StatisticServiceImpl(StatisticRepository statisticRepository) {
        this.statisticRepository = statisticRepository;
    }

    @Override
    public List<Statistic> findAll() {
        return statisticRepository.findAll();
    }

    @Override
    public Statistic findById(Long id) {
        return statisticRepository.findById(id).orElse(null);
    }

    @Override
    public Statistic findLast() {
        List<Statistic> statistics = statisticRepository.findAll();
        return statistics.get(statistics.size() - 1);
    }

    @Override
    public Statistic save(Statistic statistic) {
        return statisticRepository.save(statistic);
    }
}
