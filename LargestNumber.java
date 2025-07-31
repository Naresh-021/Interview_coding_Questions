package day_01;

import java.util.Scanner;

public class LargestNumber {


    public static String largestNumber(int[] arr){

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
             max = arr[i];
            }
        }
        return "The Largest Element From the Array is: "+max;
    }

    public static void main(String[] args) {
 // This are the Inputs declared        
//        int [] array = {1,3,445,65};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an Array");
        int  number = sc.nextInt();
        
        int[] arrayInput = new int[number];
        System.out.println("Enter Elements in the Array");
        for (int i = 0; i < number; i++) {
            // Taking an Inputs from the User and storing in an variable arrayInput
            arrayInput[i] = sc.nextInt();
        }
        // This For Loop used to print the array element what ever stored in an Array
        for(int num : arrayInput){
            System.out.print(num+" ");
        }
        System.out.println( );

        System.out.println(largestNumber(arrayInput));
//        System.out.println(largestNumber(array));

        sc.close();
    }

}
