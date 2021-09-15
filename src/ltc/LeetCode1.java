package ltc;

import java.util.Arrays;

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
//        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int[] res ={0,0};
        while(start<=end){
            if(nums[start]+nums[end]>target) end--;
            else if(nums[start]+nums[end]<target) start++;
            else{
                res[0] = start;
                res[1] = end;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        new LeetCode1().twoSum(nums,6);
    }
}
