package cycle3;

public class cycle3 {
    public int start;
    public int finish;
    public void showCycle(){
        do {
            System.out.println(start);
            start++;
        }while (start <= finish);
        }
    }


