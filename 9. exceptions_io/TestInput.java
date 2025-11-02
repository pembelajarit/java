import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Mahasiswa implements Serializable {
    String nama;
    int umur;

    Mahasiswa(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur;
    }
}

public class TestInput {
    public static void main(String[] args) {
        // File Reader
        try {
            FileReader reader = new FileReader("9. exceptions_io\\example.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }

        // File Writer
        try {
            FileWriter writer = new FileWriter("9. exceptions_io\\output.txt");
            writer.write("Halo Java Programmer!");
            writer.close();
        } catch (IOException e){
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }

        System.out.println();

        // Random Access File
        try {
            RandomAccessFile raf = new RandomAccessFile("9. exceptions_io\\example.txt", "rw");
            raf.seek(6);  // Move to byte 100
            raf.writeBytes("shadow");  // Write integer at the current position
            raf.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Buffered Reader
        try {
            BufferedReader br = new BufferedReader(new FileReader("9. exceptions_io\\example.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e){
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }

        // Buffered Writer
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("9. exceptions_io\\output.txt"));
            bw.write("This is a line of text.");
            bw.newLine();  // Adds a newline.
            bw.close();
        } catch (IOException e){
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }

        // FileInputStream
        /*try {
            FileInputStream fis = new FileInputStream("9. exceptions_io\\cat.jpg");
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print(byteData);
            }
            fis.close();
        } catch (IOException e){
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }*/

        // FileOutputStream
        byte[] byteArray = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 }; // itu sama dengan teks "Hello Java"

        try (
            FileOutputStream fos = new FileOutputStream("9. exceptions_io\\image_copy.jpg")) {
            fos.write(byteArray);
            System.out.println("File berhasil dibuat sebagai image_copy.jpg");
            fos.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }

        File file = new File("example.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            System.out.println("File Size: " + file.length() + " bytes");
        } catch (IOException e){
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }

        try {
            FileReader reader = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // Serialization
        List<Mahasiswa> daftarMhs = new ArrayList<>();
        daftarMhs.add(new Mahasiswa("Rani", 21));
        daftarMhs.add(new Mahasiswa("Budi", 22));
        daftarMhs.add(new Mahasiswa("Sari", 20));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("9. exceptions_io\\object.dat"))) {
            for (Mahasiswa m : daftarMhs){
                oos.writeObject(m);
            }
            System.out.println("Data Mahasiswa berhasil diserialisasi ke object.dat!");
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialisasi (membaca kembali objek dari file)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("9. exceptions_io\\object.dat"))) {
            System.out.println("\nData Mahasiswa yang dibaca kembali:");
            for (int i=0; i < daftarMhs.size(); i++){
                Mahasiswa m = (Mahasiswa) ois.readObject();
                System.out.println(m);
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }    
    }
}
