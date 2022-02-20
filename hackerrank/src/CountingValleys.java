import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);
        System.out.println(result);

        bufferedReader.close();
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int height = 0;
        int resultCnt = 0;
        boolean downFlag = true;
        char[] chars = path.toCharArray();

        for (int i = 0; i < steps; i++) {
            height += (chars[i] == 'U' ? 1 : -1);
            if (height < 0 && downFlag) {
                downFlag = false;
                resultCnt++;
            } else if (height > -1) {
                downFlag = true;
            }
        }
        return resultCnt;
    }
}
