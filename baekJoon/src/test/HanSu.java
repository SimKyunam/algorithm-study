package test;

import java.util.Scanner;

public class HanSu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int cnt = 0;
        if(input < 0 || input > 1000) {
            return;
        }

        for(int i=1; i <= input; i++) {
            String value = String.valueOf(i);
            char[] chars = value.toCharArray();

            if(chars.length > 2) {
                int first = chars[0] - 48;

                int subCnt = 0;
                int subCollect = chars.length-1;
                for(int j=1; j<chars.length; j++) {
                    if(chars[j]-first == first) {
                        ++subCnt;
                        if(subCollect == subCnt) {
                            cnt ++;
                        }
                    }else{
                        break;
                    }
                }
            }else{
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}
