package day_01;

import java.util.Scanner;

public class FibonacciNumber {

    public static void fibonacci(int numberFromUser){
        int start =0;
        int firstNumber=1;
        int secondNumber;

        for (int i = 0; i < numberFromUser; i++) {

            System.out.print(start+" ");
/*
Here we are Adding start number and the first Number that are storing in variable second Number
then we swap start --> first Number and first Number --> theThird variable which is second Number

 */
            secondNumber = start + firstNumber;
            start = firstNumber;
            firstNumber = secondNumber;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for The Series: ");
        int inputFromUser = sc.nextInt();
        fibonacci(inputFromUser);

        sc.close();
    }
}
