import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        String resultString = result.stream()
                .map(Object::toString)
                .collect(joining(" "))
                + "\n";

        System.out.println(resultString);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        if(a.size() != b.size()) return null;

        List<Integer> result = Arrays.asList(0, 0);
        IntStream.range(0, a.size()).forEach(i -> {
            if(a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            }else if(b.get(i) > a.get(i)){
                result.set(1, result.get(1) + 1);
            }
        });
//        for(int i=0; i<a.size(); i++) {
//            if(a.get(i) > b.get(i)) {
//                result.set(0, result.get(0) + 1);
//            }else if(b.get(i) > a.get(i)){
//                result.set(1, result.get(1) + 1);
//            }
//        }

        return result;
    }
}
