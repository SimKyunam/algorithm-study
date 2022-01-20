import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);

        System.out.println(result);
        bufferedReader.close();
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstSum = 0;
        int secondSum = 0;

        for(int i=0; i<arr.size(); i++) {
            firstSum += arr.get(i).get(i);
            secondSum += arr.get(i).get(arr.size() - i -1);
        }

        return Math.abs(firstSum - secondSum);
    }
}
