package test_20210825;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result3 {

    /*
     * Complete the 'widestGap' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY start
     *  3. INTEGER_ARRAY finish
     */

    public static int widestGap(int n, List<Integer> start, List<Integer> finish) {
        // Write your code here
        int[] road = new int[n];
        int carNum = start.size();
        int loadCnt = 0;
        int maxCnt = 0;

        for(int i=0; i<carNum; i++){
            int startIndex = start.get(i);
            int finishIndex = finish.get(i);

            for(int j=startIndex; j<=finishIndex; j++){
                road[j-1] = 1;
            }
        }

        for(int i=0; i<road.length; i++){
            if(road[i] == 0){
                ++loadCnt;
            }else{
                loadCnt=0;
            }

            if(loadCnt > maxCnt){
                maxCnt = loadCnt;
            }
        }

        return maxCnt;
    }

}
public class java3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int startCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> start = IntStream.range(0, startCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int finishCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> finish = IntStream.range(0, finishCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result3.widestGap(n, start, finish);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
