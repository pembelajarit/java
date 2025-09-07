public class Variables{
    // single variable
    int number = 10;
    // multiple variables
    int x = 5, y = 15, z = 20;
    final int myNum = 15;
    final int MINUTES_PER_HOUR = 60;

    // primitive data type
    byte angka1 = 127;
    short angka2 = 32767;
    int angka3 = 2147483647;
    long angka4 = 9223372036854775807l;
    float angka5 = 2.12345678f; //2.1234567
    double angka6 = 2.1234567890123456d; //2.1234567890123457
    boolean bool = true; 
    char karakter = 'B';

    // non primitive data type
    String teks = "halo";
    Integer number1 = 17;
    Float number2 = 20f;

    // autoboxing and unboxing
    Integer boxed = 5; // non primitive data type
    int unboxed = boxed; // primitive data type

    // instance var, static var, and local var
    int instanceVar = 10;
    static int staticVar = 20;

    public void showVariables(){
        int localVar = 35;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args){
        Variables v1 = new Variables();
        System.out.println(v1.number);   
        System.out.println(v1.x + v1.y + v1.z);

        int a,b,c;
        a = b = c = 45;
        System.out.println(a+b+c);

        // final keyword
        //myNum = 17; // error
        System.out.println(v1.myNum);
        System.out.println(v1.MINUTES_PER_HOUR);

        // primitive data type
        System.out.println(v1.angka1);
        System.out.println(v1.angka2);
        System.out.println(v1.angka3);
        System.out.println(v1.angka4);
        System.out.println(v1.angka5);
        System.out.println(v1.angka6);
        System.out.println(v1.bool);
        System.out.println(v1.karakter);
        System.out.println(((Object)v1.angka2).getClass().getSimpleName()); // get tipe data

        var data = 12.5f;
        System.out.println(data);
        System.out.println(((Object)data).getClass().getSimpleName());

        // non primitive data type
        System.out.println(v1.teks + " panjang karakter: " + v1.teks.length());
        System.out.println(v1.number1.toString() + v1.number2.toString());

        // autoboxing and unboxing
        System.out.println(v1.boxed);
        System.out.println(v1.unboxed);

        // instance var, static var, and local var
        v1.instanceVar=20;
        Variables.staticVar=50;
        //v1.localVar = 7;
        v1.showVariables();

        Variables v2 = new Variables();
        v1.instanceVar = 7;
        v2.instanceVar = 8;
        System.out.println(v1.instanceVar);
        System.out.println(v2.instanceVar);

        v1.staticVar = 10;
        v2.staticVar = 15;
        System.out.println(v1.staticVar);
        System.out.println(v2.staticVar);        
    }
}


