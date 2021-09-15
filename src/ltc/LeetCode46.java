package ltc;

import java.util.LinkedList;
import java.util.List;

public class LeetCode46 {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track =new LinkedList<>();
        dfs(nums,0,track);
        return res;
    }

    public void dfs(int[] nums,int begin, LinkedList<Integer> track){
        if(track.size()==nums.length){
            res.add(new LinkedList(track));
            return;
        }
        for(int i=begin;i<nums.length;i++){
            if (track.contains(nums[i])) {
                continue;
            }

            track.add(nums[i]);

            dfs(nums,i,track);

            track.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode46().permute(new int[]{1,2,3}));
    }
}
