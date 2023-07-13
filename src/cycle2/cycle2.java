package cycle2;

public class cycle2 {
    public int start;
    public int finish;
    public void showCycle() {
        while (start <= finish) {
            System.out.println(finish);
            start += 2; //al poner el menos va a retroceder de 2 en 2
        }
    }
}
