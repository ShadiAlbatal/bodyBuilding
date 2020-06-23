package com.corona.coco.app.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class exerciseService {

    @Autowired
    private exerciseRepository exerciseRepository;

    public List<exercise> getAllExercises(){
        return exerciseRepository.findAll();
    }

    public exercise create(exercise exercise){
        return exerciseRepository.save(exercise);
    }
}
