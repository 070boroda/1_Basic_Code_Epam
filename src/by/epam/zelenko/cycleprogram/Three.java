package by.epam.zelenko.cycleprogram;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        int count = 0;

        for (int i=1; i<=100;i++){
            count+=Math.pow(i,2);
        }
        System.out.println(count);
    }
}
