package ltc;

public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        if(nums.length==0) return res;
        if(nums.length<2){
            if(nums[0]==target) {
                res[0]=0;
                res[1]=0;
                return res;
            }else{
                return res;
            }
        }
        int mid = nums.length/2;
        int left = 0;
        int right = nums.length-1;

        while(nums[mid]!=target){

            // if(nums[left]!=target) left++;
            // if(nums[right]!=target) right--;


            if(nums[mid]>target) {
                right = mid;
                mid=(mid+left)/2;

            }else if(nums[mid]<target){
                left=mid;
                mid=(mid+right)/2;
            }else{
                left = mid;
                right = mid;

            }

        }
        if (nums[mid] == target) {
            left = mid;
            right = mid;
        }
        while (nums[left] == target || nums[right] == target) {
            if (nums[left]==target){
                left--;
                continue;
            }
            if (nums[right]==target) {
                right++;
                continue;
            }
        }
        if (nums[left + 1] == target && nums[right - 1] == target) {
            res[0] = left+1;
            res[1] = right-1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};

        int[] res = new LeetCode34().searchRange(nums, 6);
        System.out.println(res[0] + " " + res[1]);
    }
}
