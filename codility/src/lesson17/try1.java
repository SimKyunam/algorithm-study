package lesson17;

public class try1 {
    public static void main(String[] args) {
        int result = Solution.solution(new int[]{1, 5, 2, -2});
        System.out.println(result);
    }

    static class Solution {
        public static int solution(int[] A) {
            // write your code in Java SE 8
            int[] result = new int[A.length];
            int[] giho = new int[A.length];
            int max=0 ;
            int maxIndex=0;
            int sum = 0;

            for(int i=0; i<A.length; i++){
                giho[i] = A[i] > -1 ? 1 : -1;

                if(A[i] > max){
                    max = A[i];
                    maxIndex = i;
                }
            }

            for(int i=0; i<A.length; i++){
                result[i] = maxIndex != i ? -1 * giho[i] : giho[i];
                sum += result[i] * A[i];
            }

            System.out.println(sum);
            return sum;
        }
    }
}


