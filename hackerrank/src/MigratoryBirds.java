import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);

        bufferedReader.close();
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer ,Integer> birdMap = new HashMap<>();
        arr.forEach(integer -> {
            if(!birdMap.containsKey(integer)) {
                birdMap.put(integer, 1);
            } else {
                birdMap.put(integer, birdMap.get(integer) + 1);
            }
        });

        int max = 0;
        int result = 0;
        for(Integer key : birdMap.keySet()) {
            if(max < birdMap.get(key)) {
                max = birdMap.get(key);
                result = key;
            }else if(max == birdMap.get(key) && result > key) {
                result = key;
            }
        }

        return result;
    }
}
