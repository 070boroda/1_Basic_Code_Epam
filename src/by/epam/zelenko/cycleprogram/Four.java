package by.epam.zelenko.cycleprogram;

public class Four {

    public static void main(String[] args) {

        int count = 1;

        for (int i=1; i<=200;i++){
            count*=Math.pow(i,2);
        }
        System.out.println(count);
    }
}
