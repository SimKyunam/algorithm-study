import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        staircase(n);

        bufferedReader.close();
    }

    public static void staircase(int n) {
        // Write your code here
        for(int i = 0; i < n; i++){
            String print = "";
            for(int j = 0; j < n - (1 + i); j++){
                print += " ";
            }
            for(int j = 0; j < i + 1; j++) {
                print += "#";
            }
            System.out.println(print);
        }
    }
}
