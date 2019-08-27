package com.example.springcricket.resource;

import com.example.springcricket.model.Score;
import com.example.springcricket.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/rest/score")
public class ScoreResource {

    @Autowired
    ScoreRepository scoreRepository;

    @GetMapping(value = "/")
    public List<Score> getAll() {
        List<Score> score = scoreRepository.findAll();
        List<Score> result = new ArrayList<Score>();
        result.add(score.get(score.size()-1));
        return result;
    }
}