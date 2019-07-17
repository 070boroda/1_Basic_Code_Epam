package by.epam.zelenko.cycleprogram;

public class Two {

    public static void main(String[] args) {

        int a;
        int b;
        double y;
        double x;
        double h;

        a=-6;
        b=-4;
        h=0.1;
        for (x=a;x<=b;x+=h )
        {
            System.out.print("x= " +x+",");
            if (x>2){
                y = x;
                System.out.println("y ="+y);
            }
            else if (x<=-2){
                y =-x;
                System.out.println("y ="+y);

            }
        }
    }
}
