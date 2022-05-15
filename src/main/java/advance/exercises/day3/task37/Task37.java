package advance.exercises.day3.task37;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Task37 {

    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(20);
        for (int i = 0; i <= 10; i++) {
            executor.execute(new MyRunnable("job-" + i));
            System.out.println(executor);
        }
        System.out.println("====");
        System.out.println(executor);
    }
}
