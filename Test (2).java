import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Sharik");

        System.out.println("Cat:");
        System.out.println("Run: " + cat.run(300));
        System.out.println("Swim: " + cat.swim(10));
        System.out.println("Jump:" + cat.jump(1.5));

        System.out.println("Dog:");
        System.out.println("Run: " + dog.run(300));
        System.out.println("Swim: " + dog.swim(20));
        System.out.println("Jump:" + dog.jump(0.4));

    }
}
