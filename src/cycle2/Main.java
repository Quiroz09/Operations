package cycle2;

public class Main {
    public static void main(String[] args) {
        cycle2 first = new cycle2 ();
        first.start = 5;
        first.finish = 10;
        first.showCycle();
        cycle2 second = new cycle2();
        second.start = 2;
        second.finish = 16;
        second.showCycle();
    }
}
