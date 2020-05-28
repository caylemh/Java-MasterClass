package com.company;

public class Main {

    public static void main(String[] args) {
        Wall diningRoomWall = new Wall(30, 50.5);
        System.out.println("The Dining Room Walls dimensions: " +
                            "\n\tWidth = " + diningRoomWall.getWidth() + "m" +
                            "\n\tHeight = " + diningRoomWall.getHeight() + "m");
        System.out.println("Area (W x H) = " + diningRoomWall.getArea() + "m/sq\n");

        Wall kitchenWall = new Wall();
        kitchenWall.setHeight(50);
        System.out.println("The Kitchen Walls dimensions: " +
                "\n\tWidth = " + kitchenWall.getWidth() + "m" +
                "\n\tHeight = " + kitchenWall.getHeight() + "m");
        System.out.println("Area (W x H) = " + kitchenWall.getArea() + "m/sq\n");
    }
}
