package com.corona.coco.app.iteration;


import com.corona.coco.app.exercise.exercise;
import com.corona.coco.app.exercise.exercise;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.HashMap;

@Entity
public class Iteration {

    @Id
    @GeneratedValue
    private Long id;
    private String date;
    private HashMap<Integer, HashMap<Integer, Integer>> training;
    @OneToOne
//    @JoinColumn(name = "id",referencedColumnName = "id")
//    @NotNull
    private exercise exercise;

    public Iteration() {
    }

    public Iteration(Long id, String date, exercise exercise, HashMap<Integer,  HashMap<Integer, Integer>> training) {
        this.id = id;
        this.date = date;
        this.exercise = exercise;
        this.training = training;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public exercise getExercise() {
        return exercise;
    }

    public void setExercise(exercise exercise) {
        this.exercise = exercise;
    }

    public HashMap<Integer,  HashMap<Integer, Integer>> getTraining() {
        return training;
    }

    public void setTraining(HashMap<Integer, HashMap<Integer, Integer>> training) {
        this.training = training;
    }
}

