package com.example.springcricket.repository;

import com.example.springcricket.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
}
