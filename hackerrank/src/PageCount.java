import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PageCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = pageCount(n, p);

        bufferedReader.close();
    }

    public static int pageCount(int n, int p) {
        // Write your code here
        if (n % 2 == 1) {
            n += 1;
        }

        return 0;
    }
}
