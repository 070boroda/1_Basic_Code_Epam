package by.epam.zelenko.lineprogram;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        double a,b,c;
        double result;

        Scanner in = new Scanner(System.in);
        System.out.println("Ведите а ");
        a = in.nextDouble();
        System.out.println("Ведите b ");
        b = in.nextDouble();
        System.out.println("Ведите c ");
        c = in.nextDouble();
        System.out.println("Вы вели a=" + a +"\nВы вели b="+ b +"\nВы вели c=" + c);
        result = ((a-3)*b/2)+c;
        System.out.println("Ответ ((a-3)*b/2)+c=" + result );
    }
}
