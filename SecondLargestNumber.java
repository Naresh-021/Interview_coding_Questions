package day_01;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {


    public static void secondLargestNumber(int[] array){
        int largest =array[0];
        int secondlargest = array[0];

        for (int num : array){
       /*Here we are checking that num is greater than largest,
        then second-largest stores largest value
        largest stores and num value in it

        */
           if(num > largest){
               secondlargest = largest;
               largest = num;
           }
           // num should be greater than second-largest value , num should less than the largest valu
           else if (num >secondlargest && num <largest) {
                secondlargest = num;

           }
        }
        System.out.print("The secondlarge Number is: "+secondlargest);
        System.out.println();
//        System.out.print("The Largest Element is: "+ largest);

    }


    public static void main(String[] args) {

     int[]  array = {1,23,4,5,22,432};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int arraySize = sc.nextInt();

        int[]  arrayValue = new int[arraySize];
        System.out.println("Enter the elements in an Array:");
        for (int i = 0; i < arraySize; i++) {
            arrayValue[i] = sc.nextInt();
        }

        for (int numbers : arrayValue){
            System.out.print(numbers + " ");
        }
        System.out.println();
        secondLargestNumber(arrayValue);

//        secondLargestNumber(array);
        sc.close();

    }

}
