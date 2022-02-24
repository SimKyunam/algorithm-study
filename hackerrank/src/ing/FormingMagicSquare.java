package ing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FormingMagicSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = formingMagicSquare(s);
        System.out.println(result);

        bufferedReader.close();
    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][][] magicSquare = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}, {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}}, {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}}, {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}};

        // Write your code here
        List<Integer> dupleList = new ArrayList<>(); //중복된 값
        List<Integer> existsList = new ArrayList<>(); //존재 값
        List<Integer> searchList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for (List<Integer> numList : s) {
            for (Integer num : numList) {
                if (existsList.contains(num)) {
                    dupleList.add(num);
                } else {
                    existsList.add(num);
                }
            }
        }

        List<Integer> emptyList = searchList.stream()
                .filter(integer -> !existsList.contains(integer))
                .collect(toList());

        System.out.println(dupleList);
        System.out.println(emptyList);

        System.out.println(searchList);
        return 0;
    }
}
