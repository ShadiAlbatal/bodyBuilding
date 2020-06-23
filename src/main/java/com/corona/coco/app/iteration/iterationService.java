package com.corona.coco.app.iteration;

import com.corona.coco.app.exercise.exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class iterationService {

    @Autowired
    private iterationRepository iterationRepository;

    public List<Iteration> getAllIterations(){
        return iterationRepository.findAll();
    }

    public Iteration create(Iteration iteration){
        return iterationRepository.save(iteration);
    }

}
