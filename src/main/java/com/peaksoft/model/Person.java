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

public class Person {
    private String name;
    private int age;
    private Animal animal;

}
