package level3;

import java.util.Scanner;

public class solution_1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++) {
            int totCnt = sc.nextInt();
            int[] buildings = new int[totCnt];

            for(int i = 0; i < totCnt; i++){
                buildings[i] = sc.nextInt();
            }

            resultPrint(buildings, test_case);
        }
    }

    public static void resultPrint (int[] buildings, int testCase){
        int totSum = 0, max, maxIndex, standard;

        for(int i = 2; i < buildings.length - 2; i++){
            max = 0;
            maxIndex = 0;
            standard = buildings[i];

            //max 구하기
            for(int j = 1; j < 3; j++){
                if(buildings[i+j] > max){
                    max = buildings[i+j];
                    if(buildings[i] < buildings[i+j]){
                        maxIndex = i+j;
                    }
                }
                if(buildings[i-j] > max){
                    max = buildings[i-j];
                }
            }

            if(standard > buildings[i-1]
                    && standard > buildings[i-2]
                    && standard > buildings[i+1]
                    && standard > buildings[i+2]) {
                totSum += standard - max;
                i += 2;
            }else{
                if(maxIndex > 0)
                    i = maxIndex-1;
            }
        }

        System.out.println("#"+testCase + " " +totSum);
    }
}
