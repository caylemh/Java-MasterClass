package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Milo");
        person.setLastName("");
        person.setAge(13);
        System.out.println("Full Name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        System.out.println("Age = " + person.getAge());
        person.setFirstName("Caylem");
        person.setLastName("Harris");
        person.setAge(37);
        System.out.println("Full Name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setFirstName("Andrew");
        person.setAge(18);
        System.out.println("Full Name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("Full Name = " + person.getFullName());
    }
}
