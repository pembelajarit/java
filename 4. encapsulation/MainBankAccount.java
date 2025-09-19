// Contoh program Java sederhana dengan konsep encapsulation
// Studi kasus: Data rekening bank

class BankAccount {
    // Data disembunyikan (private)
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Getter dan Setter (akses terbatas)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "Budi", 1000000);
        System.out.println("Nama Pemilik: " + account.getOwnerName());
        System.out.println("Saldo Awal: Rp" + account.getBalance());

        account.deposit(500000);
        System.out.println("Setelah setor: Rp" + account.getBalance());

        boolean success = account.withdraw(300000);
        if (success) {
            System.out.println("Setelah tarik tunai: Rp" + account.getBalance());
        } else {
            System.out.println("Penarikan gagal, saldo tidak cukup.");
        }
    }
}
