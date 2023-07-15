package Switch1;

import java.util.Scanner;

public class mainSwitch {
    public static void main(String[] args) {
        Switch1 switch1 = new Switch1();
        Switch1 a = new Switch1();
        Scanner lector = new Scanner(System.in);

        System.out.println("Please enter an option: ");
        switch1.option = lector.nextInt();

        System.out.println(a.showOption());
    }
}
