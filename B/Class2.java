package B;
import A.Class1;

public class Class2 extends Class1 {
    public void modifyData() {
        data = 20; // Mengubah atribut protected dari Class1
        showData(); // Memanggil method protected dari Class1
    }

    public static void main(String[] args) {
        Class2 obj = new Class2();
        obj.modifyData();
    }
}
