package level2;

import java.util.Scanner;

public class solution_1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        String result = "";
        for(int i = 1; i <= T; i++){
            result += (i > 1 ? " " : "") + numberProc(String.valueOf(i));
        }

        System.out.println(result);
        sc.close();
    }

    //3, 33, 39  312 332 313 300 333
    public static String numberProc(String num){
        if(num.contains("3") || num.contains("6") || num.contains("9")){
            char[] charArray = num.toCharArray();
            num = "";
            for (char c : charArray) {
                if (c == '3' || c == '6' || c == '9') {
                    num += "-";
                }
            }
        }

        return num;
    }
}
