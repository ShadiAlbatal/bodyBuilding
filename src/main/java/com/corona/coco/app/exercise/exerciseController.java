package com.corona.coco.app.exercise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/exercise")
public class exerciseController {

    @Autowired
    private com.corona.coco.app.exercise.exerciseService exerciseService;


    @GetMapping("")
    public List<exercise> getAllExercises(){
        return exerciseService.getAllExercises();
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public exercise postExercise(@RequestBody exercise exercise){
    public ResponseEntity<Void> postExercise(@RequestBody exercise exercise){

        exercise createdTodo= exerciseService.create(exercise);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }


}
