package com.corona.coco.app.exercise;

import org.hibernate.annotations.NotFound;
        import org.hibernate.annotations.NotFoundAction;

        import javax.persistence.*;
        import java.util.HashMap;
        import java.util.List;



@Entity
public class exercise {

    @Id
    @GeneratedValue
    private Long id;
    private String exerciseName;
    private String description;


    public exercise() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public exercise(Long id, String exerciseName, String description) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.description = description;
    }
}