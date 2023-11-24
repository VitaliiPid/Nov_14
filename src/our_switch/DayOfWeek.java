package our_switch;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number fom 1 to 7 to see day of week");

        int dayOfWeekNumber = scanner.nextInt();

        switch (dayOfWeekNumber){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Seturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("There is no day of week");
        }
    }
}
