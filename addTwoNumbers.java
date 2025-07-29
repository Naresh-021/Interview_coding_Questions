package day_01;

import java.util.Scanner;

public class addTwoNumbers {


    public static void  addTwo(int a, int b){
        int sum = a+b;
        System.out.printf("The sum of two number %d",sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int secondNumber = sc.nextInt();
        addTwo(firstNumber,secondNumber);
    }

}
