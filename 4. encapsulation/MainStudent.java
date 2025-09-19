// Contoh program Java sederhana dengan konsep encapsulation
// Studi kasus: Data Mahasiswa

class Student {
    // Data disembunyikan (private)
    private String name;
    private String studentId;
    private double ipk;

    // Constructor
    public Student(String name, String studentId, double ipk) {
        this.name = name;
        this.studentId = studentId;
        this.ipk = ipk;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0 && ipk <= 4.0) {
            this.ipk = ipk;
        }
    }
}

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("Andi", "123456", 3.5);
        System.out.println("Nama: " + student.getName());
        System.out.println("NIM: " + student.getStudentId());
        System.out.println("IPK: " + student.getIpk());

        student.setIpk(3.8);
        System.out.println("IPK setelah update: " + student.getIpk());
    }
}
