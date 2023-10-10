package bt3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bt3 {
  public static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhập vào độ dài của mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập vào các số trong mảng");
            try {
                arr[i] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("không phải số nguyên, vui lòng nhập vào số nguyên");
                main(args);
            }
        }
        int sum = handleSum(arr);
        System.out.println("Tổng của mảng là " + sum);
    }
    public static int handleSum(int [] number){
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        return sum;
    }
}
