package Exam01;

public class BroadcastsTime implements Comparable{
    public int hour(Program program){
        return program.time.hour;
    }
    public int minutes(Program program) {
        return program.time.minute;
    }
//    public boolean after(BroadcastsTime t) {...}
//    public boolean befor(BroadcastsTime t) {...}
//    public boolean between(BroadcastsTime t1, BroadcastsTime t2) {...}
}
