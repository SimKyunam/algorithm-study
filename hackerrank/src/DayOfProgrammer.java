import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfProgrammer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);
        System.out.println(result);

        bufferedReader.close();
    }

    public static String dayOfProgrammer(int year) {
        int searchDay = 256;
        int[] dayArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year == 1918) {
            return "26.09.1918";
        }
        if (year >= 1918) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                dayArray[1] = 29;
            }
        } else if (year >= 1700 && year % 4 == 0) { //율리우스력
            dayArray[1] = 29;
        }

        int addDay = 0;
        String month = "";
        int day = 0;
        for (int i = 0; i < dayArray.length; i++) {
            addDay += dayArray[i];
            if (addDay + dayArray[i + 1] > searchDay) {
                day = searchDay - addDay;
                month = ((i + 2) < 10 ? "0" : "") + (i + 2);
                break;
            }
        }

        return String.format("%d.%s.%d", day, month, year);
    }
}
