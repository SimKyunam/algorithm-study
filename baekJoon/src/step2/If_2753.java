package step2;

import java.util.Scanner;

public class If_2753 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, result = 0;
        a = scanner.nextInt();

        if( a % 4 == 0 ){
            result = 1;
            if((a % 100 == 0) && (a % 400 != 0)){
                result = 0;
            }
        }

        System.out.println(result);
    }
}
