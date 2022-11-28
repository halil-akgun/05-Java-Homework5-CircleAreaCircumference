package circleareacircumference;

import java.util.Scanner;

public class circleareacircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        int r = input.nextInt();

        double circleC = circleCircumference(r);
        System.out.println(circleC);

        double circleA = circleArea(r);
        System.out.println(circleA);
    }

    public static double circleCircumference(int a) {
        return 2 * a * 3.1415926;
    }

    public static double circleArea(int a) {
        return a * a * 3.1415926;
    }

}