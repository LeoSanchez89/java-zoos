package com.example.lambda.javazoos.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "zooanimals")
@IdClass(ZooAnimalsId.class)
public class ZooAnimals extends Auditable implements Serializable {

//    1/2 the primary key for zooanimals
//    also a foregin key in the zoos table
    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "animals", allowSetters = true)
    private Zoo zoo;


//    1/2 the primary key for zooanimals
//    also a foregin key in the zoos table
    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @JsonIgnoreProperties(value = "zoos", allowSetters = true)
    private Animal animal;

    private String incomingzoo;

    public ZooAnimals() {
    }

    public ZooAnimals(Zoo zoo, Animal animal, String incomingzoo) {
        this.zoo = zoo;
        this.animal = animal;
        this.incomingzoo = incomingzoo;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getIncomingzoo() {
        return incomingzoo;
    }

    public void setIncomingzoo(String incomingzoo) {
        this.incomingzoo = incomingzoo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ZooAnimals)) return false;
        ZooAnimals that = (ZooAnimals) o;
        return ((zoo == null) ? 0 : zoo.getZooid()) == ((that.zoo == null) ? 0 : that.zoo.getZooid()) &&
                ((animal == null) ? 0 : animal.getAnimalid()) == ((that.animal == null) ? 0 : that.animal.getAnimalid());
    }

    @Override
    public int hashCode() {
        return 69;
    }
}
