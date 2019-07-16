package by.epam.zelenko.branchingprogram;

public class Three {

    public static void main(String[] args) {

        int x1 = -2;
        int y1 = 5;
        int x2 = 4;
        int y2 = 3;
        int x3 = 16;
        int y3 = -1;

        if((x3-x1)/(x2-x1) == (y3-y1)/(y2-y1)){
            System.out.println("Tochki lezat na odnoi pryamoi");
        }else {
            System.out.println("Tochki ne lezat na odnoi pryamoi");
        }
    }
}
