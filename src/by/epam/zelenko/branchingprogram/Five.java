package by.epam.zelenko.branchingprogram;

public class Five {

    public static void main(String[] args) {

        int x = 8;

        if(x<=3){
            System.out.println(Math.pow(x,2)-3*x+9);
        } else if(x>3)
            System.out.println(1/(Math.pow(x,3)+6));
    }
}
