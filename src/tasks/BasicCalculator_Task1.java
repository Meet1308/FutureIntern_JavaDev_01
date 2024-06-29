package tasks;

import java.util.Scanner;

public class BasicCalculator_Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        double num1 = sc.nextDouble();

        System.out.println("Enter Second Number : ");
        double num2 = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /) : ");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if(num2 == 0){
                    System.out.println("Error: Division by zero!");
                    return;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid Operator!");
                return;
        }

        System.out.println("Result : "+num1+" "+operator+" "+num2+" = "+result);
        sc.close();
    }
}
