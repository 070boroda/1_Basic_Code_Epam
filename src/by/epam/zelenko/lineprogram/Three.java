package by.epam.zelenko.lineprogram;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        double x,y, result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите угол x");
        x = Math.toRadians(scanner.nextInt());
        System.out.println("Введите угол y");
        y = Math.toRadians(scanner.nextInt());
        result = ((Math.sin(x) + Math.cos(y))/Math.cos(x)-Math.sin(y))*Math.tan(x*y);

        System.out.println("Ответ = " + result  );

    }
}
