package recommend;

import java.util.*;

public class solution_1244 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int i = 1; i <= T; i++){
            String number = sc.next();
            int changeCnt = sc.nextInt();

            for(int j=0; j<changeCnt; j++){
                number = changeNumber(number);
            }

            System.out.println("#"+i + " " + number);
        }
        sc.close();
    }

    public static String changeNumber(String number){
        List<Integer> numberList = new ArrayList<>();

        char[] numberCharArray = null;
        char temp;

        for(int i=0; i<number.length(); i++){
            numberCharArray = number.toCharArray();

            for(int j=0; j<number.length(); j++){
                temp = numberCharArray[i];
                numberCharArray[i] = numberCharArray[j];
                numberCharArray[j] = temp;

                int changeNumber = Integer.parseInt(String.valueOf(numberCharArray));
                if(numberList.indexOf(changeNumber) == -1){
                    numberList.add(changeNumber);
                }
            }
        }

        numberList.remove(numberList.indexOf(Integer.parseInt(number)));
        numberList.sort(Comparator.reverseOrder());

        return String.valueOf(numberList.get(0));
    }



}
