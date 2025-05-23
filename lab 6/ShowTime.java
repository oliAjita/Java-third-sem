// qsn 5

class Time {

    int hour, mins, secs;

    public Time(int h, int m, int s) {
        hour = h;
        mins = m;
        secs = s;
    }

    public Time addTime(Time t) {
        return new Time(hour + t.hour, mins + t.mins, secs + t.secs);
    }

    public Time subTime(Time t) {
        return new Time(hour - t.hour, mins - t.mins, secs - t.secs);
    }

    void display() {
        System.out.println(hour + " : " + mins + " : " + secs + "  ");
    }
}

public class ShowTime {

    public static void main(String[] args) {
        Time t1 = new Time(10, 28, 50);
        Time t2 = new Time(7, 14, 10);
        Time t3 = t1.addTime(t2);
        Time t4 = t1.subTime(t2);

        System.out.println("Time1 : ");
        t1.display();
        System.out.println("Time2 : ");
        t2.display();
        System.out.println("Total Time : ");
        t3.display();
        System.out.println("Total Time Difference: ");
        t4.display();
    }
}
