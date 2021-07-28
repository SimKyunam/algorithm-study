package level2;

import java.util.Scanner;

public class solution_1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
        String result = "";
        for(int i = 1; i <= T; i++){
            //result += (i > 1 ? " " : "") + numberProc(String.valueOf(i));
            result += (i > 1 ? " " : "")
                    + String.valueOf(i)
                        .replaceAll("3", "-")
                        .replaceAll("6", "-")
                        .replaceAll("9", "-");
        }

        System.out.println(result);
        sc.close();
    }

    //3, 33, 39
    //재귀..?
    public static String numberProc(String num){
        //base 케이스
        if(!num.contains("3") && !num.contains("6") && !num.contains("9")){
            return num;
        }

        num = num.replace("3", "-");
        num = num.replace("6", "-");
        num = num.replace("9", "-");

        return numberProc(num);
    }
}
