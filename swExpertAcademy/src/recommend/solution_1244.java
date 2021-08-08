package recommend;

import java.util.*;

public class solution_1244 {
//    5
//    123 1     321
//    2737 1    7732
//    32888 2   88832
//    4321 1
//    1129 2
    static int T, N, max;
    static char[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            String s = sc.next();
            N = sc.nextInt();
            nums = s.toCharArray();
            max = 0;
            StringBuilder ssb = new StringBuilder();

            if (s.length() <= N) {
                // 이 상황이면, 무조건 최대 값을 만들 수 있음
                for (int i = 0; i < nums.length; i++) {
                    int maxIdx = 0;
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] > nums[maxIdx]) {
                            maxIdx = j;
                        }
                    }
                    ssb.append(nums[maxIdx]);
                    nums[maxIdx] = 0;
                }

                max = Integer.parseInt(ssb.toString());
            }
            else {
                dfs(0);
            }
            System.out.println("#" + t + " " + max);
        }
        sc.close();
    }

    private static void dfs(int cnt) {
        // 기저 조건, 종료 조건
        if (cnt == N) {
            StringBuilder sb = new StringBuilder();
            for (char c : nums) {
                sb.append(c);
            }
            max = Math.max(max, Integer.parseInt(sb.toString()));
            return;
        }

        // 반복
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                char temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                dfs(cnt + 1);
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

}
