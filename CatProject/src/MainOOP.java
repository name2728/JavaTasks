package src;

public class MainOOP {

    public static void main(String[] args) {

       Cat cat = new Cat();
        cat.setColor("white");
        cat.setName("Tom");
        System.out.println("Color = " + cat.getColor()+", Name = " + cat.getName());

    }
}
