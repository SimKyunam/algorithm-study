package step3;
import java.util.*;

public class for_2739 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();

        if(x < 0 && x > 9){
            System.out.println("잘못된 구구단 입니다.");
            return;
        }

        for(int i=1; i<=9; i++){
            System.out.println(x + " * "  + i + " = " +(x * i));
        }
    }
}
