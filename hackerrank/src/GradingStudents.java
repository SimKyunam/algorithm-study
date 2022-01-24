import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = gradingStudents(grades);
        System.out.println(result);
        bufferedReader.close();
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        IntStream.range(0, grades.size()).forEach(index -> {
            Integer grade = grades.get(index);
            int remainder  = grade % 5;
            int calculate = 5 - remainder;

            if(calculate < 3 && (grade + calculate) >= 40) {
                grades.set(index, grade + calculate);
            }
        });

        return grades;
    }
}
