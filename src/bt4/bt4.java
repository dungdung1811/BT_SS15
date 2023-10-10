package bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số");
        String str = scanner.nextLine();
        int number;
        try {
            number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(" chuỗi chứa kí tự không phải sô,Chyển chuỗi về O");
            number = 0;
        }
        System.out.println(number);
    }
}
