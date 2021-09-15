package ltc;

import com.sun.tools.hat.internal.util.ArraySorter;

import java.util.*;

public class LeetCode39 {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> track = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,0,track);


        return res;
    }

    public void backtrack(int[] candidates, int target, int start,LinkedList<Integer> track) {

        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new LinkedList<>(track));
            return;

        }

        for (int i = start; i < candidates.length; i++) {

                track.add(candidates[i]);

                backtrack(candidates, target - candidates[i], i, track);

                track.removeLast();


        }
    }


    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        System.out.println(new LeetCode39().sumTrack(linkedList));

        System.out.println(new LeetCode39().combinationSum(new int[]{2,3,6,7},7));
    }


}
