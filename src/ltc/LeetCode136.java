package ltc;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode136 {
    public int singleNumber(int[] nums) {


//        new ArrayList;
        int res = 0;
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (Map.Entry entry :
                map.entrySet()) {
            if (entry.getValue().equals(1)) {
                res = (Integer) entry.getKey();
            }
        }
        return res;
    }
}
