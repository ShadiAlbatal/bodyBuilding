package com.corona.coco.app.iteration;


import com.corona.coco.app.exercise.exercise;
import com.corona.coco.app.exercise.exercise;

import javax.persistence.*;

@Entity
public class Iteration {

    @Id
    @GeneratedValue
    private Long id;
    private String date;
    //    private HashMap<Integer, Integer> description;
//    @OneToOne
////    @JoinColumn(name = "id",referencedColumnName = "id")
//    private com.corona.coco.app.exercise.exercise exercise;

    public Iteration() {
    }

    public Iteration(Long id, String date) {
        this.id = id;
        this.date = date;
//        this.exercise = exercise;

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

//    public exercise getExercise() {
//        return exercise;
//    }
//
//    public void setExercise(exercise exercise) {
//        this.exercise = exercise;
//    }
}

