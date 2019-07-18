package by.epam.zelenko.cycleprogram;

import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {

        int  a;
        int  b;
        int c=10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two values");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Enter two values");
        }
        a=scanner.nextInt();
        b=scanner.nextInt();

        while (a%c!=0) {
            System.out.print(a % c + " ");
            a = a / c;
        }
        System.out.println();
        while (b%c!=0) {
            System.out.print(b % c + " ");
            b = b / c;
        }
    }
}
