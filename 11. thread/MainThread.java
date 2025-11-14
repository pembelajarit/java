class MyThread extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
}

class MyRunnable implements Runnable {
    public void run(){
        System.out.println("Thread 2 is running");
    }
}

class Counter {
    private int count = 0;
    public synchronized void increment(){
        count++;
    }

    public synchronized int getCount(){
        return count;
    }
}

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        MyRunnable task = new MyRunnable();
        Thread thread2 = new Thread(task);
        thread2.start();

        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++){
                counter.increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10000; i++){
                counter.increment();
            }
        });

        // Menjalankan semua thread
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(0,1);
        System.out.println("Final count: " + counter.getCount());

        // Menunggu semua thread selesai
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Menampilkan hasil akhir
        System.out.println("Final count: " + counter.getCount());

    }
}
