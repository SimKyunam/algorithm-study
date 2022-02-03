import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Birthday {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = birthday(s, d, m);

        System.out.println(result);
        bufferedReader.close();
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int resultCnt = 0;

        for(int i=0; i<s.size()-m+1; i++) {
            int sum = 0;
            for(int j=i; j<i+m; j++) {
                sum += s.get(j);
            }
            if(d == sum) resultCnt++;
        }
        return resultCnt;
    }
}
