package level3;

import java.util.*;

public class solution_12004 {

    static List<Integer> array = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            if(N < 1 || N > 100) {
                return;
            }
            arraySetting(N);
            System.out.println("#" + test_case + " " + multiProc());
            array.clear();
        }
    }

    private static void arraySetting(int n) {
        for(int i=1; i<=9; i++){
            if(n % i == 0) {
                array.add(n / i);
            }
        }
    }

    private static String multiProc() {
        for(int resultNum : array){
            if(resultNum == 1) {
                return "Yes";
            } else if(resultNum < 10){
                for(int i=2; i<=9; i++){
                    if(resultNum % i == 0) {
                        return "Yes";
                    }
                }
            }
        }

        return "No";
    }
}
