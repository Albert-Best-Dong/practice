package ltc.dynamic_programming;

public class Rob {
    int max = 0;

    public int rob(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        if (nums.length==2) return Math.max(nums[0], nums[1]);

        if (nums.length == 3) {
             if(nums[0]+nums[2]<nums[1]) return nums[1];
             else return nums[0]+nums[2];
        }

        if (nums.length == 4) {
            if(nums[0]+nums[2]<nums[1]+nums[3]) return nums[1]+nums[3];
            else if(nums[0]+nums[3]>nums[1]+nums[3]) return nums[0]+nums[3];
            else
            return nums[0] + nums[2];
        }

        if (nums.length == 5) {
            if(nums[0]+nums[2]+nums[4]<nums[1]+nums[3]) return nums[1]+nums[3];
            else if(nums[1]+nums[3]<nums[0]+nums[3]&&nums[0]+nums[3]>nums[0]+nums[2]+nums[4]) return nums[0]+nums[3];
            else
                return nums[0] + nums[2]+nums[3];
        }


        int[] subNums = new int[nums.length - 1];
        for (int i = 0; i < subNums.length; i++) {
            subNums[i] = nums[i];
//            System.out.print(subNums[i]+' ');
        }


        max = Math.max(rob(subNums)+nums[nums.length-1],rob(subNums));

        return max;
    }


    public static void main(String[] args) {
//        System.out.println(new Rob().rob(new int[]{2,7,9,3,1,4}));
        System.out.println(new Rob().rob(new int[]{2,7,9,3,1}));
    }
}
