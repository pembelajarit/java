class MyTask extends Thread {
    private String taskName;

    public MyTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Step " + i);
            try {
                Thread.sleep(500); // jeda 0.5 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        MyTask t1 = new MyTask("Task 1");
        MyTask t2 = new MyTask("Task 2");
        MyTask t3 = new MyTask("Task 3");

        t1.start();  // mulai thread 1
        t2.start();  // mulai thread 2
        t3.start();  // mulai thread 3
    }
}
