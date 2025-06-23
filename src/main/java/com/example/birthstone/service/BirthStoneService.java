package com.example.birthstone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.birthstone.entity.BirthStoneEntity;
import com.example.birthstone.repository.BirthStoneRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BirthStoneService {

    private final BirthStoneRepository repository;

    public Optional<BirthStoneEntity> getStoneByMonth(String month) {
        return repository.findByMonth(month);
    }
    
    public List<BirthStoneEntity> getAllStones() {
        return repository.findAll();
    }

    public Optional<BirthStoneEntity> getStone(Long id) {
        return repository.findById(id);
    }

    public void saveStone(BirthStoneEntity stone) {
        repository.save(stone);
    }

    public void deleteStone(Long id) {
        repository.deleteById(id);
    }

}
