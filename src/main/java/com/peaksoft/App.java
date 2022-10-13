package com.peaksoft;

import com.peaksoft.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1. Maven проект тузунуз (dependency spring context кошуп)
 * 2. Animal деген интерфейс тузуп, анын animalPlus жана animalMinus деген методдору болуш керек.
 * 3. Сиз кайсы жаныбарды жакшы корсонуз, ошого жараша класс тузуп,  свойствасына породасын, тусун ж.б.у.с. кошсонуз болот.  Сиз тузгон класс Animal интерфейсин реализация кылыш керек.
 * 4. Person деген класс тузуп, свойствасына animal, name, age бериниз.
 * 5. Main'ден spring колдонуп озунуздун жана жакын бир адамыныздын жакшы коргон жаныбарын консольго чыгарыныз
 * <p>
 * PS: bean'дер тузулуш керек жана маалыматтар application.properties файлга жазылыш керек.
 */
public class App {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = context.getBean("Person1", Person.class);
        System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.getAnimal());

        person1.getAnimal().featuresOfAnimal();
        person1.getAnimal().animalMinus();
        person1.getAnimal().animalPlus();

        Person person2 = context.getBean("Person2", Person.class);
        System.out.println(person2.getName() + " " + person2.getAge() + " " + person2.getAnimal());
        person2.getAnimal().featuresOfAnimal();
        person2.getAnimal().animalMinus();
        person2.getAnimal().animalPlus();

        Person person3 = context.getBean("Person3", Person.class);
        System.out.println(person3.getName() + " " + person3.getAge() + " " + person3.getAnimal());
        person3.getAnimal().featuresOfAnimal();
        person3.getAnimal().animalMinus();
        person3.getAnimal().animalPlus();
    }
}
