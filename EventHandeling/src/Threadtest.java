
class MainThread extends Thread {
    // Overriding the run() method
    public void run() {
        // task of main thread
        for (int i = 2; i <= 400; i += 2) {
            System.out.println(i);
        }
    }
}

class TableThread extends Thread {
    // Overriding the run() method
    public void run() {
        // task of new thread
        for (int i = 1; i <= 100; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        // creating an object of MainThread
        MainThread mt = new MainThread();
        // creating an object of TableThread
        TableThread tt = new TableThread();
        // starting both threads
        mt.start();
        tt.start();
    }
}
