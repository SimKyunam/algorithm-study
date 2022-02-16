import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SockMerchant {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = sockMerchant(n, ar);
        System.out.println(result);

        bufferedReader.close();
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        ar.forEach(num -> map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1));

        int pairsCnt = 0;
        for (Integer key : map.keySet()) {
            pairsCnt += map.get(key) / 2;
        }

        return pairsCnt;
    }
}
