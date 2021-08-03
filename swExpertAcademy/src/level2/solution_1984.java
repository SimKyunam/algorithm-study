package level2;

import java.util.*;

public class solution_1984 {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            Float[] array = new Float[10];
            for(int i=0; i<10; i++) {
                array[i] = sc.nextFloat();
            }
//            Arrays.sort(array, Collections.reverseOrder());
//            Arrays.sort(array);
//            Arrays.sort(array, (o1, o2) -> o2.compareTo(o2));
//            Arrays.sort(array, new Comparator<Float>() {
//                @Override
//                public int compare(Float o1, Float o2) {
//                    return o2.compareTo(o1);
//                }
//            });

            Arrays.sort(array);

            float sum = 0f;
            int result = 0;
            for(int i=0; i < array.length; i++) {
                if(i!=0 && i != array.length-1){
                    sum += array[i];
                }
            }
            result = Math.round(sum / (array.length-2));

            System.out.println("#"+(test_case)+" "+result);
        }
    }
}

