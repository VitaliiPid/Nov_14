package our_switch;

import java.util.Scanner;

public class Main {
    // Switch
    /*

    switch {expression) { // переменная контролирующая switch может быть
                             одним из следующих типов:
                             int, byte, short, char, String
        case constant1:
         statements
         break;

        case constant2:
          statements
          break;

        case constant2:
          statements
          break;

           .
           .
           .
           default       // ОПРЕДЕЛЯЕТ ДЕЙСТВИЯ В СЛУЧАЕ ЕСЛИ ни одна
             statements     из констант не соотв. выражению в скобках


    }
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scanner.nextInt();

        switch (i){
            case 1:
                System.out.println(" i is 1");
                break;

            case 34:
                System.out.println(" i is 34");
                break;

            case 20:
                System.out.println(" i is 20");
                break;

            case 3:
                System.out.println(" i is 3");
                break;

            //default:
            //    System.out.println(" i is not between 0 and 3");


        }
        System.out.println("After switch");

    }
}
