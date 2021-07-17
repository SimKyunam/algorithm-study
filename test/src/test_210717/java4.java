package test_210717;

import java.util.Arrays;
import java.util.Vector;

public class java4 {
    public static void main(String[] args) {
        //커피 추출 개수 N = 3
        //주문 순서[4초, 2초, 2초, 5초, 3초]
        //시간(초)         //제작중 커피        //완료 순서
        // 0                [1, 2, 3]           []
        // 1                [1, 2, 3]           []
        // 2                [1, 4, 5]           [2, 3]
        //....

        solution(1, new Vector<Integer>(Arrays.asList(5)));
        solution(3, new Vector<Integer>(Arrays.asList(4, 2, 2, 5, 3)));
    }

    public static Vector<Integer> solution(int n, Vector<Integer> times){
        return times;
    }
}
