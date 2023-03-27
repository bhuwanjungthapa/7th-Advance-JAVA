public class ThreadDemo {
    public static void main(String[] args)
    {
        ThreadClass tc = new ThreadClass();
        Thread th1= new Thread(tc);
        Thread th = new Thread(tc);
        th.start();
        th1.start();
    }

}
class ThreadClass implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}