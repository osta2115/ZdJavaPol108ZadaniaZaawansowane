package advance.exercises.day3.task35;

import java.util.concurrent.TimeUnit;

public class Task35 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("job1"));
        Thread thread2 = new Thread(new MyRunnable("job2"));
        thread1.start();
        thread2.start();
        try {
            TimeUnit.SECONDS.sleep(2);
            thread1.interrupt();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Wątek został przerwany");
        }
    }
}
