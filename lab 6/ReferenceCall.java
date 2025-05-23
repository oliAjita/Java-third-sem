// qsn 6 (b)

public class ReferenceCall {

    int num;

    public ReferenceCall() {
    }

    public ReferenceCall(int n) {
        num = n;
    }

    public static void increment(ReferenceCall data) {
        data.num += 25;
        System.out.println("Number: " + data.num);
    }

    public static void main(String[] args) {
        ReferenceCall n = new ReferenceCall(20);
        System.out.println("Before call: Number: " + n.num);
        increment(n);
        System.out.println("After call: Number: " + n.num);
    }
}
