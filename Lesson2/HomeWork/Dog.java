package Lesson2.HomeWork;

public class Dog implements IAnimal{
    String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
        System.out.println(dogName);
    }

    @Override
    public String makeSound() {
        return "Whof";
    }


}
