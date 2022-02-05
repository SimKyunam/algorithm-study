package test_20220204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaTest1 {
    public static void main(String[] args) {
        String str = "000000111";

        int solution = solution(str);
        System.out.println(solution);
    }

    public static int solution(String str) {
        int result = 0;
        if(str.length() > 2) {
            String resultStr = recursive(str);
            result = resultStr.length();
        }else if(str.equals("10") || str.equals("01")) {
            result = 0;
        }else {
            result = str.length();
        }

        return result;
    }

    public static String recursive(String str) {
        if(!str.contains("01") && !str.contains("10")) {
            return str;
        }

        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length-1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if(chars[i] != chars[i+1]) {
                stringBuilder.append(chars[i]);
                stringBuilder.append(chars[i+1]);
                str = str.replaceFirst(stringBuilder.toString(), "");
                i++;
            }
        }

        return recursive(str);
    }
}
