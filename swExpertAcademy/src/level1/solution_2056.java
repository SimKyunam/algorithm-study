package level1;

import java.util.Scanner;

public class solution_2056 {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        float V;
        T = sc.nextInt();

        String[] array = new String[T];
        for(int test_case = 1; test_case <= T; test_case++){
            array[test_case-1] = sc.next();
        }

        System.out.println();
        String year, month, day;

        for(int i=0; i<array.length; i++){
            String result = "-1";
            if(array[i].length() == 8){ //정상적인 년도
                year = array[i].substring(0,4);
                month = array[i].substring(4,6);
                day = array[i].substring(6,8);
                if(valid(year, month, day)){
                    result = year + "/" + month + "/" + day;
                }
            }

            System.out.println("#"+(i+1)+" "+result);
        }
    }

    public static boolean valid(String year, String month, String day){
        boolean isReturn = true;


        int iYear = Integer.parseInt(year);
        int iMonth = Integer.parseInt(month);
        int iDay = Integer.parseInt(day);

        if(iYear < 1){
            return false;
        }else if(iMonth < 1 || iMonth > 12){
            return false;
        }else if(iDay < 1 || iDay > 31){
            return false;
        }

        switch(iMonth){
            case 2 :
                isReturn = (iDay <= 28);
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                isReturn = (iDay <= 30);
                break;
        }

        return isReturn;
    }
}

