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



class Result1 {

    public static List<String> deviceNamesSystem(List<String> devicenames) {
        // Write your code here
        Map<String, Integer> deviceNameMap = new HashMap<>();
        List<String> resultDeviceNames = new ArrayList<>();
        for(String devicename: devicenames){
            deviceNameMap.put(devicename, deviceNameMap.get(devicename) == null ? 1 : deviceNameMap.get(devicename)+1);
        }

//        for(String key : deviceNameMap.keySet()){
//            int deviceCnt = deviceNameMap.get(key);
//            for(int i=0; i<deviceCnt; i++){
//                resultDeviceNames.add(key + (i == 0 ? "" : i));
//            }
//        }

        for(int i = devicenames.size(); i > 0 ; i--){
            String deviceName = devicenames.get(i-1);
            int cnt = deviceNameMap.get(deviceName);
            deviceNameMap.put(deviceName, --cnt);
            devicenames.remove(i-1);
            devicenames.add(deviceName + (cnt == 0 ? "" : cnt));
        }

        for(int i = devicenames.size(); i > 0 ; i--){
            resultDeviceNames.add(devicenames.get(i-i));
        }


        return resultDeviceNames;
    }
}

public class java1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int devicenamesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> devicenames = IntStream.range(0, devicenamesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<String> result = Result1.deviceNamesSystem(devicenames);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
