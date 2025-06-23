package com.example.birthstone.service;

import com.example.birthstone.entity.BirthStoneEntity;
import com.example.birthstone.repository.BirthStoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BirthStoneService {

    private final BirthStoneRepository repository;

    public Optional<BirthStoneEntity> getStoneByMonth(String month) {
        return repository.findByMonth(month);
    }
}
