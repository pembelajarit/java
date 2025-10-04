// Interface: kontrak untuk semua metode pembayaran
interface PaymentMethod {
    void pay(double amount);
}

// Abstraction: kelas abstrak untuk transaksi
abstract class Transaction {
    protected double amount;
    public Transaction(double amount) {
        this.amount = amount;
    }
    // Abstraksi: method abstrak
    public abstract void process();
}

// Implementasi interface untuk pembayaran via kartu kredit
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Membayar Rp" + amount + " dengan kartu kredit " + cardNumber);
    }
}

// Implementasi interface untuk pembayaran via e-wallet
class EWalletPayment implements PaymentMethod {
    private String walletId;
    public EWalletPayment(String walletId) {
        this.walletId = walletId;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Membayar Rp" + amount + " dengan e-wallet " + walletId);
    }
}

// Implementasi abstraksi transaksi
class OnlineTransaction extends Transaction {
    private PaymentMethod paymentMethod;
    public OnlineTransaction(double amount, PaymentMethod paymentMethod) {
        super(amount);
        this.paymentMethod = paymentMethod;
    }
    @Override
    public void process() {
        System.out.println("Memproses transaksi online...");
        paymentMethod.pay(amount);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        PaymentMethod cc = new CreditCardPayment("1234-5678-9012-3456");
        PaymentMethod ew = new EWalletPayment("OVO-998877");
        Transaction trx1 = new OnlineTransaction(50000, cc);
        Transaction trx2 = new OnlineTransaction(75000, ew);

        trx1.process();
        trx2.process();
    }
}