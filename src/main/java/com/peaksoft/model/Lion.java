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


public class Lion implements Animal {
    private String name;
    private int age;
    private int weight;
    private String color;


    public void animalPlus() {
        System.out.println("Lion can run at 80 km/h");
    }

    public void animalMinus() {
        System.out.println("Lion is a predator preys on other animals");
    }

    public void featuresOfAnimal() {
        System.out.println("King of beasts");
    }
}
