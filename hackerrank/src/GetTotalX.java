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

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int resultCnt = 0;
        Integer gcdValue = a.stream().reduce(GetTotalX::gcd).orElse(0);
        Integer maxValue = a.stream().reduce(1, ((integer, integer2) -> integer * integer2)) / gcdValue;

        b.sort(Comparator.naturalOrder());
        Integer minValue = b.stream().findFirst().orElse(0);

        List<Integer> gcdArray = new ArrayList<>();
        if(maxValue > 1 || maxValue < minValue) {
            int i=1;
            int breakValue = 0;
            while (breakValue < minValue) {
                breakValue = maxValue * i;
                gcdArray.add(breakValue);
                i++;
            }
        }

        for(Integer gcdInteger : gcdArray) {
            int successCnt = 0;
            for(Integer integer : b) {
                if(gcdInteger >= integer && gcdInteger % integer == 0) successCnt++;
                else if(gcdInteger <= integer && integer % gcdInteger == 0) successCnt++;
            }

            if(successCnt == b.size()) {
                resultCnt++;
            }
        }

        return resultCnt;
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(a, a % b);
    }
}
