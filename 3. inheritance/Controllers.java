// Contoh program Java sederhana menggunakan inheritance
// Studi kasus: Sistem pembayaran transportasi

class Vehicle {
    String name;
    int capacity;

    Vehicle(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void showInfo() {
        System.out.println("Kendaraan: " + name + ", Kapasitas: " + capacity);
    }

    int calculateFare(int passengers) {
        return 0; // default, override di subclass
    }
}

class Bus extends Vehicle {
    int farePerPerson;

    Bus(String name, int capacity, int farePerPerson) {
        super(name, capacity);
        this.farePerPerson = farePerPerson;
    }

    @Override
    int calculateFare(int passengers) {
        return passengers * farePerPerson;
    }
}

class Taxi extends Vehicle {
    int baseFare;
    int perKmFare;

    Taxi(String name, int capacity, int baseFare, int perKmFare) {
        super(name, capacity);
        this.baseFare = baseFare;
        this.perKmFare = perKmFare;
    }

    @Override
    int calculateFare(int distance) {
        return baseFare + (distance * perKmFare);
    }
}

public class Controllers {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus Kota", 40, 5000);
        Taxi taxi = new Taxi("Taxi Online", 4, 10000, 3000);

        bus.showInfo();
        System.out.println("Total tarif bus untuk 10 penumpang: Rp" + bus.calculateFare(10));

        taxi.showInfo();
        System.out.println("Total tarif taxi untuk 7 km: Rp" + taxi.calculateFare(7));
    }
}
