package bt1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hendleAddInteger(scanner);
    }

    private static void hendleAddInteger(Scanner scanner){

        try {
        System.out.println("Hãy nhập lần lượt 2 số a, b");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("a+b " + (a+b));

        } catch (NumberFormatException e){
            System.out.println("đầu vào không đúng định dạng, hãy thử lại");
            hendleAddInteger(scanner);
        }
    }
}
