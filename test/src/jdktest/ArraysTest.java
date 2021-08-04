package jdktest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysTest {
    public static void main(String[] args) {
        Integer[] array = {3, 17, 1, 39, 8, 41, 2, 32, 99, 2};

        Arrays.sort(array);
        Arrays.sort(array, Comparator.reverseOrder());
        Arrays.sort(array, (o1, o2) -> o2.compareTo(o1));
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for(int result: array){
            System.out.print(result + "  ");
        }
    }
}
