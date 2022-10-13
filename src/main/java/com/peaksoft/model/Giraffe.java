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

public class Giraffe implements Animal {
    private String name;
    private int age;
    private int weight;
    private String color;



    public  void featuresOfAnimal (){
        System.out.println("Giraffe has got very big beautiful eyes");
    }
    public void animalPlus() {
        System.out.println("He can easily get the leaves from top of the tree :)");
    }

    public void animalMinus() {
        System.out.println("His long neck prevents him from running :(");
    }


}
