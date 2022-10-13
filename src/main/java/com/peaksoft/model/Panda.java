package com.peaksoft.model;

import com.peaksoft.service.Animal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor


public class Panda implements Animal {
    private String name;
    private int age;
    private int weight;
    private String color;


    public void animalPlus() {
        System.out.println("Pandas very cute:)");
    }

    public void animalMinus() {
        System.out.println("Pandas very lazy animals, they eat bamboos lying down");

    }

    public void featuresOfAnimal() {
        System.out.println("Panda is listed in the Red Book");
    }
}

