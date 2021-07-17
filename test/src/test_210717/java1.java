package test_210717;

import java.util.Arrays;

public class java1 {
    public static void main(String[] args) {
        //두 문자열을 앞뒤로 합쳐서 짧은 것 출력, 단 여러개면 사전순 앞서는 문자 출력
        //s1        //s2        //result
        //xyZA      ABCxy       ABCxyZA
        //AxA       AyA         AxAyA
        //xyAB      ABxy        ABxyAB
        //abAB      ABab        ababAB

        System.out.println(solution("xyZA", "ABCxy"));
        System.out.println(solution("AxA", "AyA"));
        System.out.println(solution("xyAB", "ABxy"));
        System.out.println(solution("abAB", "abab"));
    }

    public static String solution(String s1, String s2){
        String fAppend = appendString(s1, s2);
        String sAppend = appendString(s2, s1);

        String result = "";
        if(fAppend.length() > sAppend.length()){ //두번째가 작다
            result = sAppend;
        }else if(fAppend.length() < sAppend.length()){ //첫번째가 작다
            result = fAppend;
        }else{ //둘다 동일하다
            if(fAppend.equals(sAppend)){ //동일 문자열
                result = fAppend;
            }else{
                result = stringToCharCompare(fAppend, sAppend);
            }
        }

        return result;
    }

    public static String appendString(String s1, String s2){
        String sAppend = s1 + s2;
        char fFirstInit = s1.charAt(0);

        String replaceWord = s2.substring(s2.lastIndexOf(fFirstInit));
        String replaceWord2 = s1.substring(0, replaceWord.length());

        if(replaceWord.equals(replaceWord2)){
            sAppend = s2.substring(0, s2.lastIndexOf(replaceWord)) + s1;
        }

        return sAppend;
    }

    public static String stringToCharCompare(String s1, String s2){
        char[] charArray = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        String result = "";

        for(int i=0; i<charArray.length; i++){
            if(charArray[i] > charArray2[i]){
                result = s2;
                break;
            }else if (charArray[i] < charArray2[i]){
                result = s1;
                break;
            }
        }

        return result;
    }
}
