package by.epam.zelenko.branchingprogram;

public class Two {

    public static void main(String[] args) {

        int a = 9;
        int b = 6;
        int c = 7;
        int d = 5;
        int result;
        int res1;
        int res2;

        result = (res1 = (a < b ? a : b)) >  (res2 = (c < d ? c : d)) ? res1 : res2;

        System.out.println(result);
    }

}
