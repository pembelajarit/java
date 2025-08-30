class Pekerja {
    // instance variables
    String name;
    private float salary;

    // constructor 
    public Pekerja(String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    // getters method
    public String getName(){
        return name;
    }

    public float getSalary(){
        return salary;
    }

    // setters method
    public void setName(String name){
        this.name = name;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    // instance method
    public void displayDetails(){
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }
}

/*There are 3 ways to initialize object in Java.
1. By reference variable
2. By method
3. By constructor*/

public class Main {
    public static void main(String[] args) {
        // create an object of Pekerja class
        Pekerja pekerja = new Pekerja("Alice", 500000);
        
        // display initial details
        pekerja.displayDetails();
        
        // modify attributes using setters
        pekerja.setName("Bob");
        pekerja.setSalary(1000000);
        
        // display updated details
        pekerja.displayDetails();

        // modify attributes using reference variable
        pekerja.name = "John";
        
        // display updated details
        pekerja.displayDetails();
    }   
}