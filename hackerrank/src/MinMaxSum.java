import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());

        Long minSum = arr.subList(0, arr.size() - 1)
                .stream()
                .mapToLong(value -> value)
                .reduce(0, Long::sum);
        Long maxSum = arr.subList(1, arr.size())
                .stream()
                .mapToLong(value -> value)
                .reduce(0, Long::sum);

        System.out.print(minSum + " " + maxSum);
    }
}
