package day_01;

import java.util.Scanner;

public class swapNumbers {


    public  static void swap(int a , int b){

        int temp;

        System.out.println("The Numbers Before Swap: "+ a + " and "+b);
        temp = a;
        a = b;
        b = temp;

        System.out.printf("The Numbers After Swap %d and %d",a,b);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int firstNumber=sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int secondNumber = sc.nextInt();


        swap(firstNumber,secondNumber);
        sc.close();

    }
}
