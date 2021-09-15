package ltc.dsf;

public class LeetCode704 {
    int index = -1;
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length ;
        int mid = (left+right)/2;
        dfs(nums,target,left,mid,right,index);
        return index;
    }

    public void dfs(int[] nums,int target, int left,int mid,int right, int i){
        if(left+1==right) return;
        if(nums[mid]==target){
            index = mid;
            return;
        }

        if(nums[mid]<target){
            left=mid;
            mid = (left+right+1)/2;
            dfs(nums,target,left,mid,right,index);
        }else if(nums[mid]>target){
            right = mid;
            mid = (left+right)/2;
            dfs(nums,target,left,mid,right,index);
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode704().search(new int[]{-1,0,3,5,9,12},2));
    }
}
