class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// single inheritance
class Cat extends Animal{
    void miauw() {
        super.eat();
        System.out.println("Miauw.");
    }

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// multilevel inheritance
class Kitten extends Cat {
    @Override
    void sound() {
        System.out.println("Kitten meows");
    }
}

// hierarchical inheritance
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.miauw();
        cat1.sound();

        Kitten kitten1 = new Kitten();
        kitten1.miauw();
        kitten1.sound();

        Dog dog1 = new Dog();
        dog1.sound();

        System.out.println(cat1 instanceof Animal);
        System.out.println(cat1 instanceof Cat);
        System.out.println(dog1 instanceof Animal);
    }
}