public class SingleThreadDemo {
    public static void main(String[] args) {
        printTask("Task 1");
        printTask("Task 2");
        printTask("Task 3");
    }

    public static void printTask(String taskName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Step " + i);
            try {
                Thread.sleep(500); // jeda 0.5 detik untuk melihat proses
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
