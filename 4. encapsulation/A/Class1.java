package A;

public class Class1 {
    protected int data = 10;
    protected void showData() {
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.showData();
    }
}
