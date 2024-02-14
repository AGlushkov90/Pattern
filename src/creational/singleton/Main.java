package creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(() -> {
            Singleton instance = Singleton.getInstance("qwerty");
            System.out.println(instance.getValue());
        });
        executorService.execute(() -> {
            Singleton instance = Singleton.getInstance("qwerty1");
            System.out.println(instance.getValue());
        });
        executorService.execute(() -> {
            Singleton instance = Singleton.getInstance("qwerty2");
            System.out.println(instance.getValue());
        });
    }
}
