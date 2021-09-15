package ltc.dsf;

import java.util.*;

public class LeetCode56 {

    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        LinkedList<Integer> list = new LinkedList<>();
        list.add(intervals[0][0]);
        list.add(intervals[0][1]);
        for (int i = 1; i < n; i++) {

        }
        int[][] res = new int[list.size() / 2][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = list.poll();
            res[i][1] = list.poll();
        }
        return res;
    }



    public static void main(String[] args) {
//        int[][] nums = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] nums = new int[][]{{4, 6}, {3, 5}, {2, 3}, {15, 18}};
//        new LeetCode56().merge(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i][0] + "  " + nums[i][1]);
        }
    }
}
