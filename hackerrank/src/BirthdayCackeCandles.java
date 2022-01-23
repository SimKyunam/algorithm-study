import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BirthdayCackeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = birthdayCakeCandles(candles);
        System.out.println(result);

        bufferedReader.close();
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        candles.sort(Comparator.reverseOrder());
        Integer first = candles.stream().findFirst().get();

        long count = candles.stream().filter(first::equals).count();

        return (int) count;
    }
}
