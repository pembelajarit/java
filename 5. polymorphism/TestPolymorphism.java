class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing menggonggong");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeong");
    }
}

class MathOperations {
    // overloaded methods
    int add(int a, int b){
        return a + b;
    }

    double add(double a,double b){
        return a + b;
    }

    int add (int a, int b, int c){
        return a + b + c;
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Hewan myDog = new Anjing();
        Hewan myCat = new Kucing();

        myDog.suara();
        myCat.suara();

        MathOperations m = new MathOperations();
        System.out.println(m.add(5, 10));       // Panggil add(int, int)
        System.out.println(m.add(3.5, 2.5));    // Panggil add(double, double)
        System.out.println(m.add(1, 2, 3));
    }   
}
