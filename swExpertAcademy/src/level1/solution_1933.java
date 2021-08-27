package level1;

import java.util.*;

public class solution_1933 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        long start, end;
        int cnt = 0;

        //반으로 줄였을때 약수 구하기
        List<Integer> list = new ArrayList<>();
        start = System.currentTimeMillis();
        for(int i = 1; i * 2 <= N; i++) {
            if(N % i == 0){
                ++cnt;
                list.add(i);
            }else{
                continue;
            }

            int mock = (N / i);
            if(mock % N == 0 && mock > (N / 2)){
                ++cnt;
                if(!list.contains(mock)){
                    list.add(mock);
                }
            }
        }

        list.sort(Comparator.naturalOrder());
        for(int i = 0; i < list.size(); i++){
            System.out.print((i > 0 ? " " : "") + list.get(i));
        }
        end = System.currentTimeMillis();

        System.out.println();
        System.out.print(cnt);
        System.out.println();
        System.out.println("수행시간: " + (end - start) + " ms");

        System.out.println("------------------------------------");
        cnt = 0;

        //일반적인 약수 구하기
        start = System.currentTimeMillis();
        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                System.out.print((i > 1 ? " " : "") + i);
                ++cnt;
            }
        }
        end = System.currentTimeMillis();

        System.out.println();
        System.out.print(cnt);
        System.out.println();
        System.out.println("수행시간: " + (end - start) + " ms");
    }
}
