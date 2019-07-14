package by.epam.zelenko.branchingprogram;

public class One {


    public static void main(String[] args) {

        int a = 90;
        int b = 75;
        int c;

        c=180 - a - b;
        if (c < 0) {
            System.out.println("Такого треугольника не существует");
        } else if((a == 90 || b ==90) || c == 90){
            System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Треугольник существует");
        }
    }
}
