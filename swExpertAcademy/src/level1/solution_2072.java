package level1;

import java.util.Scanner;

public class solution_2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, V;
        T = sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
        int sum=0;
        for(int test_case = 1; test_case <= T; test_case++){
            sum = 0;
            for(int i=0; i<10; i++){
                V = sc.nextInt();
                if(V % 2 == 1){
                    sum += V;
                }
            }
            System.out.println();
            System.out.println("#"+test_case+" "+sum);
        }

        sc.close();
    }
}
