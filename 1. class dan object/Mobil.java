public class Mobil{
    String merk = "Toyota"; 
    String warna = "Hitam";
    int tahun = 2020;

    void maju(){
        System.out.println("Mobil " + merk + " warna "+ warna + " Tahun " + tahun + " bergerak maju");
    } 
    void mundur(){
        System.out.println("Mobil " + merk + " warna "+ warna + " Tahun " + tahun + " bergerak mundur");
    }

    public static void main(String[] args) {
        Mobil myMobil = new Mobil();

        myMobil.maju();
        myMobil.mundur();

        myMobil.merk = "Mercedes";
        myMobil.warna = "Merah";
        myMobil.maju();
    }
}