package com.corona.coco.app.iteration;


import com.corona.coco.app.exercise.exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/iteration")
public class iterationController {

    @Autowired
    private iterationService iterationService;


    @GetMapping("")
    public List<Iteration> getAllExercises(){
        return iterationService.getAllIterations();
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public exercise postExercise(@RequestBody exercise exercise){
    public ResponseEntity<Void> postExercise(@RequestBody Iteration iteration){

        Iteration createdTodo= iterationService.create(iteration);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }


}
