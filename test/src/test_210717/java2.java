package test_210717;

import java.util.Arrays;

public class java2 {
    public static void main(String[] args) {
        //성적을 기준으로 등수를 구하기
        //grade             result
        //[2, 2, 1]         [1, 1, 3]
        //[3, 2, 1, 2]      [1, 2, 4, 2]

        int[] array1 = {2, 2, 1};
        int[] array2 = {3, 2, 1, 2};

        System.out.println(solution(array1));
        System.out.println(solution(array2));
    }

    public static String solution(int[] grade){
        System.out.println(Arrays.toString(grade));

        int[] rankArray = new int[grade.length];
        int rank = 1;
        for(int i=0; i<grade.length; i++){
            rankArray[i] = 1;
            for(int j=0; j<grade.length; j++){
                if(grade[i] < grade[j]){
                    ++rankArray[i];
                }
            }
        }

        return Arrays.toString(rankArray);
    }
}
