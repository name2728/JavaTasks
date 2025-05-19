package main.java;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setColor("white");
        cat.setName("Tom");
        System.out.println("Color = " + cat.getColor()+" Name = " + cat.getName());

    }
}
