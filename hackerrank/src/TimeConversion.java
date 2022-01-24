import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);
        System.out.println(result);

        bufferedReader.close();
    }

    public static String timeConversion(String s) {
        // Write your code here
        String amOrPm = s.substring(s.length() - 2);
        String time = s.substring(0, s.length() - 2);

        String[] timeArray = time.split(":");
        int hour = Integer.parseInt(timeArray[0]);
        int minutes = Integer.parseInt(timeArray[1]);
        int second = Integer.parseInt(timeArray[2]);

        if((hour < 0 || hour > 12)
                || (minutes < 0 || minutes > 60)
                || (second < 0 || second > 60)) {
            return "";
        }

        if(amOrPm.equalsIgnoreCase("PM") && hour < 12) {
            hour = hour + 12;
        }else if(amOrPm.equalsIgnoreCase("AM") && hour == 12){
            hour = 0;
        }

        return (hour < 10 ? "0" + hour : hour) + ":" + timeArray[1] + ":" + timeArray[2];
    }
}
