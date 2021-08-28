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

            //양옆 2개의 빌딩 중 가장 높은 높이 구하기 (max)
            for(int j = 1; j < 3; j++){
                if(buildings[i+j] > max){ //기준빌딩의 오른쪽 2칸
                    max = buildings[i+j];
                    if(buildings[i] < buildings[i+j]){ //기준 빌딩보다 높은 빌딩이 존재하는 경우 그 빌딩으로 이동
                        maxIndex = i+j;
                    }
                }
                if(buildings[i-j] > max){ //기준빌딩의 왼쪽 2칸
                    max = buildings[i-j];
                }
            }


            if(standard > buildings[i-1]
                    && standard > buildings[i-2]
                    && standard > buildings[i+1]
                    && standard > buildings[i+2]) { //기준 빌딩이 가장 높은 경우
                totSum += standard - max;
                i += 2;
            }else{
                if(maxIndex > 0) //현재 기준점에 다음 2칸 중 높은 빌딩이 있는 경우
                    i = maxIndex-1; //반복문에 시작을 가장 높은 maxIndex 위치로 이동
            }
        }

        System.out.println("#"+testCase + " " +totSum);
    }
}
