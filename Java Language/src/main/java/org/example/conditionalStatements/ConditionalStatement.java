package org.example.conditionalStatements;

public class ConditionalStatement {
    public static void main(String[] args) {

        // if else

        int num1 = 10;

        if(num1 == 10){
            System.out.println("hello");
        }
        else {
            System.out.println("bye");
        }

        // if else if

        int num2 = 11;
        if(num2 < 10){
            System.out.println("hello");
        }
        else if(num2 > 10) {
            System.out.println("hello2");
        }
        else {
            System.out.println("bye");
        }

        // ternary operators

        int val = 100;
        String msg = val >100? "Greater than 100":"Less than 100";
        System.out.println(msg);

        // switch statement

        int n = 3;
        switch (n){
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
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
