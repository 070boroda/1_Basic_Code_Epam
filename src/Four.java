import java.util.Scanner;

public class Four {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число формата ххх,ууу");
        double a = scanner.nextDouble();

        String str = String.valueOf(a);
        String str1 = str.substring(0,3);
        String str2 = str.substring(4,7);

        System.out.println(str2 + "." +str1);

    }
}
