import java.io.IOException;
import java.util.Scanner;

public class CatAndMouse {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        //x, y Cat
        //z Mouse
        String result = "";
        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);

        if (catA == catB) {
            result = "Mouse C";
        } else if (catA > catB) {
            result = "Cat B";
        } else if (catB > catA) {
            result = "Cat A";
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
            System.out.println(result);
        }

        scanner.close();
    }
}
