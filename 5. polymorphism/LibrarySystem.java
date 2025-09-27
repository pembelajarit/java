// Implementasi sistem perpustakaan dengan konsep OOP
// Base class untuk item perpustakaan
class LibraryItem {
    private String id;
    private String title;
    protected boolean isAvailable;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    // Encapsulation: getter dan setter
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Polymorphism: method yang akan di-override
    public void displayInfo() {
        System.out.println("ID: " + id + ", Title: " + title);
    }

    public double calculateLateFee(int daysLate) {
        return 0.0;
    }
}

// Inheritance: Book mewarisi LibraryItem
class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String id, String title, String author, int pages) {
        super(id, title);
        this.author = author;
        this.pages = pages;
    }

    // Override method dari parent class
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author + ", Pages: " + pages);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1000; // Rp1000 per hari
    }
}

// Inheritance: DVD mewarisi LibraryItem
class DVD extends LibraryItem {
    private int duration;
    private String director;

    public DVD(String id, String title, String director, int duration) {
        super(id, title);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Director: " + director + ", Duration: " + duration + " minutes");
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 2000; // Rp2000 per hari
    }
}

// Class untuk mengelola peminjaman
class Borrower {
    private String memberId;
    private String name;
    private LibraryItem[] borrowedItems;
    private int itemCount;

    public Borrower(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedItems = new LibraryItem[5]; // Maksimal 5 item
        this.itemCount = 0;
    }

    public boolean borrowItem(LibraryItem item) {
        if (itemCount < 5 && item.isAvailable) {
            borrowedItems[itemCount] = item;
            item.isAvailable = false;
            itemCount++;
            return true;
        }
        return false;
    }

        // Overloading: borrow item by id
        public boolean borrowItem(String itemId, LibraryItem[] allItems) {
            for (LibraryItem item : allItems) {
                if (item.getId().equals(itemId)) {
                    return borrowItem(item);
                }
            }
            return false;
        }

    public void returnItem(LibraryItem item) {
        for (int i = 0; i < itemCount; i++) {
            if (borrowedItems[i] == item) {
                item.isAvailable = true;
                // Geser item lain ke kiri
                for (int j = i; j < itemCount - 1; j++) {
                    borrowedItems[j] = borrowedItems[j + 1];
                }
                borrowedItems[itemCount - 1] = null;
                itemCount--;
                break;
            }
        }
    }

    public void displayBorrowedItems() {
        System.out.println("Items borrowed by " + name + ":");
        for (int i = 0; i < itemCount; i++) {
            borrowedItems[i].displayInfo();
        }
    }
}

// Main class untuk testing
public class LibrarySystem {
    public static void main(String[] args) {
    // Membuat objek buku dan DVD
    Book book1 = new Book("B001", "Java Programming", "John Doe", 400);
    Book book2 = new Book("B002", "Python Basics", "Jane Smith", 300);
    DVD dvd1 = new DVD("D001", "Introduction to OOP", "Prof. Johnson", 120);

    // Array semua item
    LibraryItem[] allItems = {book1, book2, dvd1};

    // Membuat objek peminjam
    Borrower borrower = new Borrower("M001", "Alice");

    // Testing peminjaman
    System.out.println("=== Testing Library System ===");
        
    borrower.borrowItem(book1); // borrow by object
    borrower.borrowItem("B002", allItems); // borrow by id (overloading)
    borrower.borrowItem(dvd1); // borrow by object
        
    System.out.println("\nDisplaying borrowed items:");
    borrower.displayBorrowedItems();

    System.out.println("\nReturning book1...");
    borrower.returnItem(book1);

    System.out.println("\nDisplaying borrowed items after return:");
    borrower.displayBorrowedItems();

    // Testing late fee calculation (polymorphism)
    System.out.println("\nCalculating late fees for 5 days:");
    System.out.println("Book late fee: Rp" + book2.calculateLateFee(5));
    System.out.println("DVD late fee: Rp" + dvd1.calculateLateFee(5));
    }
}