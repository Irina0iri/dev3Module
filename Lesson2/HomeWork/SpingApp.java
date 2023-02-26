package Lesson2.HomeWork;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpingApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAnimal animal = context.getBean("myAnimal1",IAnimal.class);
        IAnimal animal1 = context.getBean("myAnimal",IAnimal.class);

        System.out.println(animal.makeSound());
        System.out.println(animal1.makeSound());
        context.close();
    }
}
