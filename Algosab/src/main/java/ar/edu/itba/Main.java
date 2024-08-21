package ar.edu.itba;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static final int N = 1000000000;


    public static void main(String[] args) {

        TimerJoda t2;
        try {
            t2= new TimerJoda();
            t2.stop();
        }
        catch(Exception e) {
        }

        int[] myArray = new int[N];
        int rta;

        // generate array
        for (int rec = N; rec > 0; rec--)
            myArray[N - rec] = rec;


        t2= new TimerJoda();
        rta = AlgoA.max(myArray);
        t2.stop();

        System.out.printf("max Algo A %d. Delay %s (ms)%n", rta, t2);

        // generate array
        for (int rec = N; rec > 0; rec--)
            myArray[N - rec] = rec;

        t2= new TimerJoda();
        rta = AlgoB.max(myArray);
        t2.stop();
        System.out.printf("max Algo B %d. Delay %s (ms)%n", rta, t2);

    }

}