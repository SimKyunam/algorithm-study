import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kangaroo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

        bufferedReader.close();
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String result = "";
        if((v1 <= v2)) {
            result = "NO";
        }else{
            result = recursive(x1, v1, x2, v2);
        }
        return result;
    }

    public static String recursive(int x1, int v1, int x2, int v2) {
        if(x1 > x2){
            return "NO";
        }else if(x1 == x2){
            return "YES";
        }
        return recursive(x1+v1, v1, x2+v2, v2);
    }
}
