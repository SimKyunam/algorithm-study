package fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PageCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = pageCount(n, p);
        System.out.println(result);

        bufferedReader.close();
    }

    public static int pageCount(int n, int p) {
        // Write your code here

        // 처음 푼 로직
//        int orgOrd = 0;
//        int revOrd = 0;
//        if (n == p) {
//            return 0;
//        }
//
//        for (int i = 0; i < n + 1; i += 2) {
//            if (i == p || i + 1 == p) {
//                break;
//            }
//            orgOrd++;
//        }
//
//        if (n % 2 == 0) {
//            n += 1;
//        }
//        for (int i = n; i >= 0; i -= 2) {
//            if (i == p || i - 1 == p) {
//                break;
//            }
//            revOrd++;
//        }
//
//        return Math.min(orgOrd, revOrd);


        //정답 참고값
        int front = p / 2;
        int back = (n / 2) - front;
        return Math.min(front, back);
    }
}
