package level2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class solution_1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, N;
        T = sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++) {
            //세팅
            N = sc.nextInt();
            if(N < 2 || N > 1000000){
                break;
            }

            double[] numArray = new double[N];
            for(int i = 0; i < N; i++) {
                numArray[i] = sc.nextInt();
            }

            //로직 처리
            double result = logicProc(numArray);

            //결과 소수점 없이 치환
            DecimalFormat df = new DecimalFormat("#");
            String StrResult = df.format(result);

            System.out.println("#"+test_case +" "+ StrResult);
        }
    }

    //로직 처리
    public static double logicProc(double[] numArray){
        double result = 0;
        boolean isLastIndex = false;
        for(int i = numArray.length-1; i > -1; i--) {
            for(int j = i-1; j > -1; j--) {
                if(numArray[j] >= numArray[i]) {
                    i = j+1;
                    break;
                } else {
                    result += numArray[i] - numArray[j];
                }

                if(j == 0){
                    isLastIndex = true;
                    break;
                }
            }

            if(isLastIndex){
                break;
            }
        }

        return result;
    }
}
