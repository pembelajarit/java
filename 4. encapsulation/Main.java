import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
class Person {
    private String name;
    private int age;

    // getter method
    public String getName(){
        return name;
    }

    // setter method
    public void setName(String newName){
        this.name = newName;
    }

    // getter method
    public int getAge(){
        return age;
    }

    // setter method
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
    }
}

// encapsulation with validation

class BankAccount {
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance +=amount;
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -=amount;
        }
    }
}

public class Main {
    public static void main(String[] args){
        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');
        simbol.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("#,###", simbol);

        Person p1 = new Person();
        p1.setName("Andi");
        // p1.name = "Jono";
        p1.setAge(20);
        System.out.println("Nama: " + p1.getName() + ", Usia: " + p1.getAge());

        BankAccount a1 = new BankAccount();
        a1.deposit(1000000);
        a1.withdraw(200000);
        System.out.println("Rp."+df.format(a1.getBalance()));
    }
}
