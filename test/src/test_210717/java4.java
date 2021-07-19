package test_210717;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
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

        //solution(1, new Vector<Integer>(Arrays.asList(5)));
        solution(3, new Vector<Integer>(Arrays.asList(4, 2, 2, 5, 3)));
    }

    public static Vector<Integer> solution(int n, Vector<Integer> times){
        int number = n;
        Vector<Integer> result = new Vector<>();
        Stack<Integer> integerStack = new Stack<>();

        ArrayList<Integer> work = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();

        //init
        for(int i=0; i<n; i++){
            if(i > times.size()){
                break;
            }
            work.add(times.remove(0));
            index.add(i);
        }

        //[4, 2, 2]
        //[1, 2, 3]
        while(true){
            if(times.size() == 0){
                break;
            }

            for(int i=0; i<times.size(); i++){
                int w = work.get(i);
                work.add(i, --w);

                if(w == 0){
                    number++;
                    result.add(index.get(i));
                    index.remove(i);
                    work.remove(i);

                    index.add(number);
                    work.add(times.remove(0));
                }
            }
        }


        //workProcess(work, index, result);

        return times;
    }

    public static void workProcess(Vector<Integer> work, Vector<Integer> index, Vector<Integer> result){
        //base 조건
        if(work.size() == 0){
            return;
        }

        for(int i=0; i<work.size(); i++){
            int w = work.get(i);
            --w;

            if(w == 0){
                result.add(index.get(i));
                work.remove(i);
                index.remove(i);
            }
        }
    }
}
