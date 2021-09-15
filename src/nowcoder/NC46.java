package nowcoder;

import java.util.*;

public class NC46 {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> track = new ArrayList<>();
    int len = 0;

    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        Arrays.sort(num);
        len =num.length;
        backtrack(num,0,target);

        return res;
    }

    public void backtrack(int[] arr,int cur,int target){


        if(target<0) return;

        if (target==0) {
            if(!res.contains(track)){
                res.add(new ArrayList<>(track));
            }
            return;
        }


        for (int i = cur; i < len; i++) {
            if(i>cur&&arr[i]==arr[i-1]) continue;
            if (arr[i]<=target) {
                track.add(arr[i]);
                backtrack(arr,i+1,target-arr[i]);
                //回退
                track.remove(track.size() - 1);

            }

        }


    }



    public static void main(String[] args) {
        int[] nums = {2,3};
        System.out.println(new NC46().combinationSum2(nums, 5));

//        int[] nums1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        System.out.println(new NC46().combinationSum2(nums1, 20));
    }
}
