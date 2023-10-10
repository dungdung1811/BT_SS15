package bt5;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("nhập vào số a");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập vào số b");
            int b = Integer.parseInt(scanner.nextLine());
            int sum = a + b;
            System.out.println("sum của a + b  là " + sum);
            int sub = a - b;
            System.out.println("sub của a-b  là " + sub);
            int mul = a * b;
            System.out.println("mul a * b  là " + mul);
            int div = a / b;
            System.out.println("div của a/b là " + div);

        } catch (NumberFormatException a) {
            System.out.println("không phải số nguyên vui lòng nhập lại");
            main(args);
        } catch (ArithmeticException e) {
            System.out.println("không thể chia cho 0, nhập lại số b");
            main(args);

        }
    }

}
