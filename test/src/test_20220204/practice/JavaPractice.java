package test_20220204.practice;

public class JavaPractice {
    public static void main(String[] args) {
        int[][] result = {{1, 4}, {3, 4}, {3, 10}};

        solution(result);
    }

    public static int[] solution(int[][] v) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        for(int i=0; i<v.length; i++) {
            x ^= v[i][0];
            y ^= v[i][1];
        }
        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}
