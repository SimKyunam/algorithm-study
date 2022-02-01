import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BreakingTheRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = breakingRecords(scores);

        String resultString = result.stream()
                .map(Object::toString)
                .collect(joining(" "))
                + "\n";

        System.out.println(resultString);

        bufferedReader.close();
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int min = -1;
        int max = -1;
        List<Integer> resultArray = Arrays.asList(0, 0);

        for(int i=0; i<scores.size(); i++) {
            if(min == -1 && max == -1) {
                min = scores.get(i);
                max = scores.get(i);
            }else if(min > scores.get(i)) {
                min = scores.get(i);
                resultArray.set(1, resultArray.get(1)+1);
            }else if(max < scores.get(i)) {
                max = scores.get(i);
                resultArray.set(0, resultArray.get(0)+1);
            }
        }

        return resultArray;
    }
}

