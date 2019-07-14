package by.epam.zelenko.lineprogram;

public class Five {

    public static void main(String[] args) {
        int value = 9860;
        int hour;
        int minutes;
        int seconds;

        hour = value / 3600;

        minutes = (value % 3600) / 60;

        seconds = ((value % 3600) % 60);

        System.out.println(hour + "." + minutes + "." +seconds);
    }
}
