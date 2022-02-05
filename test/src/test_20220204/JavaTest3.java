package test_20220204;

public class JavaTest3 {
    public static int result = 0;
    public static void main(String[] args) {
        String line1 = "abbbcbbb";
        String line2 = "bbb";
        int solution = solution(line1, line2);

        System.out.println(solution);
    }

    public static int solution(String line1, String line2) {
        return recursive(line1, line2, 1);
    }

    public static int recursive(String line1, String line2, int plus) {
        if(line1.length() <= line2.length() + 2 * plus) {
            return result;
        }

        char[] lineArray = line1.toCharArray();
        char[] line2Array = line2.toCharArray();
        for(int i=0; i<lineArray.length; i++) {
            int resultCnt = 0;

            if(lineArray[i] == line2Array[0]) {
                int index = i;
                for(int j=0; j<line2Array.length; j++) {
                    if(index >= lineArray.length) {
                        break;
                    }
                    if(lineArray[index] == line2Array[j]) {
                        resultCnt ++;
                        index += plus;
                    }
                }

                if(resultCnt == line2Array.length) {
                    result++;
                }
            }
        }

        return recursive(line1, line2, plus+1);
    }
}
