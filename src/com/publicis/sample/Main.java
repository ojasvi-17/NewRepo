package com.publicis.sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        double result;

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.print("Enter any operator (+, -, *, /): ");
        char option = sc.next().charAt(0);

        switch(option)
        {
            case '+':
                result = a + b;
                break;

            case '-':
                result =a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;

            default:
                System.out.println("Wrong Choice.");
                return;
        }

        System.out.println("The result for "+option+"is :"+result);
    }

}
