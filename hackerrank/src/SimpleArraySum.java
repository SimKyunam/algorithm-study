import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SimpleArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = simpleArraySum(ar, arCount);

        System.out.println(result);
    }

    public static int simpleArraySum(List<Integer> ar, int arCount) {
        // Write your code here
        if(ar.size() != arCount)
            return 0;

        return ar.stream().reduce(0, Integer::sum);
    }
}
