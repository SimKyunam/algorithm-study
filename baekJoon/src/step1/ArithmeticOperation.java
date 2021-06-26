package step1;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        System.out.println((int)(a + b));
        System.out.println((int)(a - b));
        System.out.println((int)(a * b));
        System.out.println((int)(a / b));
        System.out.println((int)(a % b));
    }
}
