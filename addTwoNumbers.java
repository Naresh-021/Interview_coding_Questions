package day_01;

import java.util.Scanner;

public class addTwoNumbers {


    public static void  addTwo(int a, int b){
         int sum = a+b;
        // i have taken the printf because to display the number which i have taken and their sum 
        System.out.printf("The sum of two number %d and %d is %d",a,b,sum);
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
