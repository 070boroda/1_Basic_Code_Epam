package by.epam.zelenko.lineprogram;

import java.util.Scanner;

public class Two {

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
        result = ((b+(Math.sqrt(Math.pow(b,2)+4*a*c))/2*a))-Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.println("Ответ " + result );
    }
}
