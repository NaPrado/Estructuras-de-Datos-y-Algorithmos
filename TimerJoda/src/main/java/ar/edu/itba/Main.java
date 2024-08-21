package ar.edu.itba;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TimerJoda tj = new TimerJoda();
        sleep(1000);
        tj.stop();
        System.out.println(tj);
    }
}
