import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }
    public static void plusMinus(List<Integer> arr) {
        if(arr.size() < 1) return;

        Map<String, Double> numberMap = new HashMap<>();
        numberMap.put("plus", 0.0);
        numberMap.put("minus", 0.0);
        numberMap.put("zero", 0.0);

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > 0) {
                numberMap.put("plus", numberMap.get("plus") + 1);
            } else if(arr.get(i) == 0) {
                numberMap.put("zero", numberMap.get("zero") + 1);
            } else if(arr.get(i) < 0) {
                numberMap.put("minus", numberMap.get("minus") + 1);
            }
        }

        int size = arr.size();
        Double plus = numberMap.get("plus") / size;
        Double minus = numberMap.get("minus") / size;
        Double zero = numberMap.get("zero") / size;

        System.out.printf("%.6f%n", plus);
        System.out.printf("%.6f%n", minus);
        System.out.printf("%.6f%n", zero);
    }

}
