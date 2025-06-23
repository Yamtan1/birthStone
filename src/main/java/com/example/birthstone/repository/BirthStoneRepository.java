package com.example.birthstone.repository;

import com.example.birthstone.entity.BirthStoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BirthStoneRepository extends JpaRepository<BirthStoneEntity, Long> {
    Optional<BirthStoneEntity> findByMonth(String month);
}
