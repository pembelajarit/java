class MyCustomException extends Exception {
    public MyCustomException(String message){
        super(message);
    }
}

public class ExceptionsAssertions {
    public static void main(String[] args) {
        // int[] angka = {1, 2, 3};
        // System.out.println(angka[4]);

        // int x = 7, y =0;
        // System.out.println("sebelum pembagian");
        // int hasil = x/y;
        // System.out.println("hasil: " + hasil);

        try {
            int[] angka = {1,2,3};
            System.out.println(angka[2]);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan");
        } finally {
            System.out.println("selalu dieksekusi");
        }

        try {
            int result = divide(10,0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            e.printStackTrace();
            // System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Eksekusi selesai");
        }

        int waktu = 8;
        if (waktu > 7){
            throw new ArithmeticException("anda terlambat, tidak diizinkan masuk");
        } else {
            System.out.println("tidak terlambat");
        }

        ExceptionsAssertions demo = new ExceptionsAssertions();
        try {
            demo.checkValue(5);
        } catch (MyCustomException e){
            System.out.println("Custom Error: " + e.getMessage());
        }

        demo.checkAge(-2);
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

    public void checkValue(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException("Value tidak boleh negatif");
        }

        System.out.println("Value valid: " + value);
    }

    public void checkAge(int age){
        assert age > 0 : "Usia harus positif";
        System.out.println("Usia " + age);
    }
}
