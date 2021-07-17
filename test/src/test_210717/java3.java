package test_210717;

public class java3 {
    public static void main(String[] args) {
        //n         result
        //15        3
        //23        5
        //18        4
        //7         -1
        System.out.println(solution(15));
        System.out.println(solution(23));
        System.out.println(solution(18));
        System.out.println(solution(7));
    }

    public static int solution(int n){
        int returnResult = -1;
        final int BIG_BOX = 5;
        final int SMALL_BOX = 3;

        if(numDist(n, BIG_BOX) % SMALL_BOX == 0){ //나머지 3
            returnResult = numResult(n, BIG_BOX, SMALL_BOX);
        }else if(numDist(n, SMALL_BOX) % 5 == 0) { //나머지 5
            returnResult = numResult(n, SMALL_BOX, BIG_BOX);
        }

        return returnResult;
    }

    public static int numResult(int n, int s1, int s2){
        return (n / s1) + ((n % s1) / s2);
    }

    public static int numDist(int n, int div){
        return n % div;
    }
}
