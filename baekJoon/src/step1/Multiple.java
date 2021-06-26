package step1;

import java.util.*;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        char[] charArray = String.valueOf(b).toCharArray();
        for(int i = charArray.length-1; i > -1; i--){
            char val = charArray[i];
            System.out.println(a * (val - '0'));
        }
        System.out.println(a*b);
    }
}
