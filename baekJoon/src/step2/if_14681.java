package step2;

import java.util.*;

public class if_14681 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x, y;

        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x == 0 || y == 0){
            System.out.println("0좌표는 입력이 안됩니다.");
            return;
        }

        if(x > 0){
            if(y > 0){
                System.out.println(1);
            }else if(y < 0){
                System.out.println(4);
            }
        }else if(x < 0){
            if(y > 0){
                System.out.println(2);
            }else if(y < 0){
                System.out.println(3);
            }
        }
    }
}
