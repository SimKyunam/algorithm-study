package level1;

import java.util.Scanner;
import java.io.FileInputStream;

public class solution_2071 {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        float V;
        T = sc.nextInt();

        float[][] array = new float[T][10];
        for(int test_case = 1; test_case <= T; test_case++){
            for(int i=0; i<10; i++) {
                array[test_case-1][i] = sc.nextFloat();
            }
        }

        System.out.println();
        for(int i=0; i<array.length; i++){
            float sum = 0;
            for(int j=0; j<array[i].length; j++){
                sum += array[i][j];
            }
            int result = Math.round(sum / 10);
            System.out.println("#"+(i+1)+" "+result);
        }
    }
}

