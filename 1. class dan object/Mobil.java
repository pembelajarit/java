public class Mobil{
    String merk = "Toyota"; 
    String warna = "Hitam";
    int tahun = 2020;

    void maju(){
        System.out.println("Mobil " + merk + " warna "+ warna + " Tahun " + tahun + " bergerak maju");
    } 
    public void mundur(){
        System.out.println("Mobil " + merk + " warna "+ warna + " Tahun " + tahun + " bergerak mundur");
    }

    public static void companyInfo(){
        System.out.println("Semua mobil diproduksi di luar negeri");
    }
    public static void main(String[] args) {
        Mobil.companyInfo();
        Mobil myMobil = new Mobil();

        myMobil.maju();
        myMobil.mundur();

        myMobil.merk = "Mercedes";
        myMobil.warna = "Merah";
        myMobil.maju();

        System.out.println("Tipe data myMobil.warna adalah: " + ((Object)myMobil.warna).getClass().getSimpleName());
    }
}