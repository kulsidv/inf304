package Thread;

import java.util.ArrayList;
import java.util.List;

public class MainThread {
    public static void main(String[] args) {
        int countOfThreads = Runtime.getRuntime().availableProcessors();
        List<Part> thlist = new ArrayList<>();
        double p = 0;

        for (int i = 0; i < countOfThreads; i++) {
            thlist.add(new Part(p, p + Math.sqrt(Math.PI)/4));
            p += Math.sqrt(Math.PI)/countOfThreads;
        }
        thlist.forEach(t -> t.start());
        thlist.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("Количество потоков: " + countOfThreads);
        System.out.println("Интеграл равен " + thlist.get(0).getSum());
    }
}
