package step3;

import java.util.*;

public class for_10950 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        if(len < 0){
            System.out.println("잘못된 수를 입력하셨습니다.");
            return;
        }

        if(len == 0){
            return;
        }

        int[] resultArray = new int[len];

        for(int i=0; i<len; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a < 1 || a > 9 || b < 1 || b > 9){
                System.out.println("숫자를 잘못 입력했습니다.");
                return;
            }

            resultArray[i] = a+b;
        }

        for(int i=0; i<resultArray.length; i++){
            System.out.println(resultArray[i]);
        }

        scanner.close();
    }
}
