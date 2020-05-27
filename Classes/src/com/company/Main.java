package com.company;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car audi = new Car();

	    porsche.setModel("Carrera");
	    audi.setModel("RS5");

        System.out.println("The Car Make is a Porsche:\n\t" + porsche.getModel());
        System.out.println("The Car Make is a Audi:\n\t" + audi.getModel());

    }
}
