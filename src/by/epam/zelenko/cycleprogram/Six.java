package by.epam.zelenko.cycleprogram;

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {

        int m;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter m and n");
        while (!scanner.hasNextInt()) {
            System.out.println("Enter m and n");
            scanner.next();
        }
        m = scanner.nextInt();
        n = scanner.nextInt();

        for (int i=n; i < m; i++) {
            if (m % i == 0) {
                System.out.println(m / i);
            }
        }
    }
}
