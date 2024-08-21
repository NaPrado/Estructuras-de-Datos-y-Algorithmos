package ar.edu.itba;
import org.joda.time.*;

public class TimerJoda{
    Instant startTime;
    Instant endTime;
    public TimerJoda(){
        startTime = Instant.now();
    }
    public void stop(){
        endTime = Instant.now();
    }

    @Override
    public String toString() {
        Period period = new Period(startTime, endTime);
        return period.toString().split("PT")[1].split("S")[0];
    }
}
