package Philosophers;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2);
        CommonResource res = new CommonResource();
        for (int i = 1; i < 6; i++) {
            new Thread(new PhilosopherCount(res, sem, i)).start();
        }

    }
}
