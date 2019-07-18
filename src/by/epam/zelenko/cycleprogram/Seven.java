package by.epam.zelenko.cycleprogram;

import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {

        int  a;
        int  b;
        int c=10;
        int [] a1 = new int[10];
        int [] a2;
        int j =0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two values");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Enter two values");
        }
        a=scanner.nextInt();
        b=scanner.nextInt();

        while (a%c!=0) {
            a1[j++] = a%c;
            a = a / c;
        }

        for (int i = 0; i<a1.length-1;i++){
            System.out.println(a1[i]);
        }

        System.out.println();
        while (b%c!=0) {
            System.out.print(b % c + " ");
            b = b / c;
        }
    }
}
