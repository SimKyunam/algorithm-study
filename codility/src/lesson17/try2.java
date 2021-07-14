package lesson17;

public class try2 {
    public static void main(String[] args) {
        int result = Solution.solution(new int[]{1, 5, 2, -2});
        System.out.println(result);
    }

    static class Solution {
        public static int solution(int[] A) {
            int beforeIndex = 0;
            int afterIndex = 1;
            int sum = 0;

            if(A.length > 1){
                sum = isMaxIndex(A, beforeIndex, afterIndex, sum);
            }else if (A.length == 1){
                sum = A[0];
            }

            System.out.println(sum);
            return sum;
        }

        public static int isMaxIndex(int[] A, int bIndex, int aIndex, int sum){
            if(A.length < aIndex){
                return sum;
            }else{
                if(A[bIndex] < A[aIndex]){
                    sum += -1 * bIndex;
                    isMaxIndex(A, aIndex, ++aIndex, sum);
                }else{
                    sum += -1 * aIndex;
                    isMaxIndex(A, bIndex, ++aIndex, sum);
                }
            }
            return bIndex;
        }
    }
}


