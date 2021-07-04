package step2;
import java.util.*;

public class if_2884 {

    public static void main(String[] args){
        int hour, min, totMin, resultHour, resultMin;

        Scanner scanner = new Scanner(System.in);
        hour = scanner.nextInt();
        min = scanner.nextInt();

        if(hour < 0 || hour > 23){
            System.out.println("시간 영역을 잘못 선택했습니다.");
            return;
        }else if(min < 0 || min > 59){
            System.out.println("분 영역을 잘못 선택했습니다.");
            return;
        }

        totMin = ((hour == 0 ? 24 : hour) * 60) + min;
        totMin -= 45;

        int hourDiv = totMin >= (24 * 60) ? totMin / (24 * 60) : totMin;

        resultHour = hourDiv / 60;
        resultMin = totMin % 60;

        System.out.println(resultHour + " " +resultMin);
    }
}
