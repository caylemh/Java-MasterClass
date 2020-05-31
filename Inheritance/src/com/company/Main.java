package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"long & silky");
//        dog.eat();
//        dog.walk();
//        dog.run();

        Fish fish = new Fish("Gold Fish", 3,5,2,2,4);
        fish.eat();
        fish.move(10);
    }
}
