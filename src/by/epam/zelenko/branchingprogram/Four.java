package by.epam.zelenko.branchingprogram;

public class Four {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int x = 8;
        int y = 4;
        int z = 11;

        if((x <=a && y<=b) || (y<=a && x<=b)){
            System.out.println("true");
        } else if((x <=a && z<=b) || (z<=a && x<=b)) {
            System.out.println("true");
        } else if((y <=a && z<=b) || (z<=a && y<=b)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
