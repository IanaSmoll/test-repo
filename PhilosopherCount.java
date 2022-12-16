package Philosophers;

import java.util.concurrent.Semaphore;

public class PhilosopherCount implements Runnable {

    CommonResource res;
    Semaphore sem;
    int number;

    PhilosopherCount(CommonResource res,Semaphore sem, int number){
        this.res = res;
        this.sem = sem;
        this.number = number;
    }

    @Override
    public void run() {

        try {
            sem.acquire();
            System.out.println("Филосов " + this.number + " садится за стол");
            res.x = 1;
            for (int i = 0; i < 5; i++) {
                res.x++;
                Thread.sleep(100);
            }
        }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        System.out.println("Филосов " + this.number + " выходит из-за стола");
        sem.release();
        }
    }
 // проверка git

