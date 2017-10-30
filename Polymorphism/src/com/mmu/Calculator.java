package com.mmu;

import java.util.Scanner;

public class Calculator {
    public Calculator() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean exit = false;
        Double firstNumber, secondNumber, thirdNumber;
        while (exit == false) {
            System.out.println("Enter your first number");
            firstNumber = scanner.nextDouble();
            System.out.println("Enter your second number");
            secondNumber = scanner.nextDouble();
            System.out.println("Do you want to enter a third number (note: you can only do addition or multiplication if you do)? enter y/n");
            if (scanner.nextLine().toLowerCase().contains("yes") == true || scanner.nextLine().toLowerCase().contains("y") == true){
                System.out.println("Enter your third number");
                thirdNumber = scanner.nextDouble();
            }
            else {
                thirdNumber = (double) 0;
            }
                System.out.println("Enter what operation to perform: 'Add', 'Subtract', 'Multiply' or 'Divide'");
                String input = scanner.nextLine().toLowerCase();
                switch (input) {
                    case "add" :
                        if (thirdNumber != 0) {
                            System.out.println(CalculatorUtils.add(firstNumber,secondNumber,thirdNumber));
                        }
                        else {
                            System.out.println(CalculatorUtils.add(firstNumber,secondNumber));
                        }
                        break;
                    case "subtract" :
                        System.out.println(CalculatorUtils.subtract(firstNumber, secondNumber));
                        break;
                    case "multiply" :
                        if (thirdNumber != 0) {
                            System.out.println(CalculatorUtils.multiply(firstNumber, secondNumber , thirdNumber));
                        }
                        else {
                            System.out.println(CalculatorUtils.multiply(firstNumber, secondNumber));
                        }
                        break;
                    case "divide" :
                        System.out.println(CalculatorUtils.divide(firstNumber, secondNumber));
                        break;
                }
                System.out.println("Do you want to perform another operation?");
            if (scanner.nextLine().toLowerCase().contains("no") == true || scanner.nextLine().toLowerCase().contains("n") == true){
                exit = true;
            }
        }
    }
}
