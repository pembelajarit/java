abstract class Animal {
    abstract void sound(); // abstract method
    void eat() {
        System.out.println("Eating");
    }
}

interface Drawable {
    void draw();
}

class Cat extends Animal {
    void sound(){
        System.out.println("Meow");
    }
}

class Circle implements Drawable {
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}

public class AbstractInterfaces {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.sound();
        cat1.eat();

        Circle c1 = new Circle();
        c1.draw();
    }
}