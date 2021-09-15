package ltc.dsf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode77 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        backtrack(n, k,1, list);
        return res;
    }

    public void backtrack(int n, int k,int start, List<Integer> track){

        if (track.size() == k) {
            res.add(new LinkedList<>(track));
            return;
        }
        if (track.size() < n&&!track.isEmpty()) {
            start = track.get(track.size()-1);
        }
        for (int i = start; i <= n; i++) {
            if (track.contains(i)) {
                continue;
            } else {
                    track.add(i);
            }
            backtrack(n, k,start, track);
            track.remove(track.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode77().combine(4,2));
    }
}
