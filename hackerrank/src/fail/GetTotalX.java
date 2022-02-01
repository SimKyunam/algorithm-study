package fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class GetTotalX {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = getTotalX(arr, brr);
        System.out.println(total);

        bufferedReader.close();
    }

    // 1부터 100까지에서 A(나머지를 구하는 기준이 되는 값)과, B(구하는 값)을 기준으로 구하기..
    // 최대공약수, 최소공배수로 생각하다 틀림.. (유클리드 호제법도 알아두기)
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int resultCnt = 0;
        for(int i = 1; i <= 100; i++) {
            boolean isOk = true;
            for(int j=0; j < a.size() && isOk; j++) {
                if(i % a.get(j) != 0) isOk = false;
            }
            for(int j=0; j < b.size() && isOk; j++) {
                if(b.get(j) % i != 0) isOk = false;
            }

            if(isOk)
                resultCnt++;
        }

        return resultCnt;
    }

}
