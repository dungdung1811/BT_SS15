package bt2;

import java.util.Arrays;
import java.util.Scanner;

public class bt2 {
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter length of array");
        int arrlength = Integer.parseInt(scanner.nextLine());
        int [] number = new int[arrlength];
        if (number.length == 0) {
            throw new NullPointerException("empty array");
        } else {
            for (int i = 0; i <number.length ; i++) {
                System.out.println("enter number");
                number[i] = Integer.parseInt(scanner.nextLine());
            }
            // tim max
            int max = seachMax(number);
            if(max != Integer.MIN_VALUE){
                System.out.println("Max number in Array is " + max );
            } else {
                System.out.println("Array is null");
            }
        }
    }
    public static int seachMax(int [] arr) {
        int max =Integer.MIN_VALUE;
        for (int number: arr) {
            if(number > max){
                max =number;
            }
        }
        return max;
    }


}
