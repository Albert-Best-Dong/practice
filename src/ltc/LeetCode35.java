package ltc;

import java.util.Queue;

public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int middle = (start+end)/2;
        return dfs(nums,start,end,target);
    }

    public int dfs(int[] nums,int left,int right,int target){
        if(left>right) return (left+right+1)/2;
        int mid = (left+right)/2;
        if(mid==nums.length) return mid;
        if(nums[mid] == target) return mid;
        if(nums[mid]<target){
            left = mid+1;
            return dfs(nums,left,right,target);
        }else{
            right=mid -1;
            return dfs(nums,left,right,target);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5};
        System.out.println(new LeetCode35().searchInsert(nums,4));
    }
}
