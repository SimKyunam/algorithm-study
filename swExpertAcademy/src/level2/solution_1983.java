package level2;

import java.util.*;

public class solution_1983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, stuCnt, searchStu, rangAverage;
        T = sc.nextInt();

        Float[] scoreSortArray = null;
        float[] scoreArray = null;
        float[] scoreRangeArray = null;

        for(int test_case = 0; test_case < T; test_case++) {
            stuCnt = sc.nextInt(); //학생 수
            searchStu = sc.nextInt(); //학점을 알고싶은 학생 범호
            rangAverage = stuCnt / 10;

            if(validCheck(stuCnt, searchStu)){ //제약조건 설정
                return;
            }

            scoreSortArray = new Float[stuCnt];
            scoreArray = new float[stuCnt];
            scoreRangeArray = new float[10];

            for(int i = 0; i < stuCnt; i++){
                for(int j = 0; j < 3; j++) {
                    float score = sc.nextFloat();
                    float percent = 0.2f;
                    if(j == 0) { //중간
                        percent = 0.35f;
                    }else if(j == 1){ //기말
                        percent = 0.45f;
                    }
                    scoreArray[i] += score * percent; //점수 입력
                    scoreSortArray[i] = scoreSortArray[i] != null ? scoreSortArray[i] + (score * percent) : (score * percent);
                }
            }

            //정렬 후 기준점수 저장
            Arrays.sort(scoreSortArray, Comparator.reverseOrder());
            for(int j = 1; j <= scoreRangeArray.length; j++) {
                scoreRangeArray[j-1] = scoreSortArray[(rangAverage * j) - 1];
            }

            System.out.println("#" + (test_case+1) + " " + resultReturn(scoreArray[searchStu-1], scoreRangeArray));
        }
    }

    public static boolean validCheck(int stuCnt, int searchStu){
        if(stuCnt % 10 != 0 || stuCnt < 10 || stuCnt > 100){
            return true;
        }else if(searchStu < 1 || searchStu > stuCnt){
            return true;
        }
        return false;
    }

    public static String resultReturn(float stuScore, float[] scoreRangeArray){
        String result = "";

        if(stuScore >= scoreRangeArray[0]){
            result = "A+";
        }else if(stuScore >= scoreRangeArray[1]){
            result = "A0";
        }else if(stuScore >= scoreRangeArray[2]){
            result = "A-";
        }else if(stuScore >= scoreRangeArray[3]){
            result = "B+";
        }else if(stuScore >= scoreRangeArray[4]){
            result = "B0";
        }else if(stuScore >= scoreRangeArray[5]){
            result = "B-";
        }else if(stuScore >= scoreRangeArray[6]){
            result = "C+";
        }else if(stuScore >= scoreRangeArray[7]){
            result = "C0";
        }else if(stuScore >= scoreRangeArray[8]){
            result = "C-";
        }else{
            result = "D0";
        }

        return result;
    }
}
