package by.epam.zelenko.cycleprogram;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        int x;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Enter number");
        }
        x = scanner.nextInt();

        for (int i=1; i<=x;i++){
           count+=i;
        }
        System.out.println(count);
    }
}
