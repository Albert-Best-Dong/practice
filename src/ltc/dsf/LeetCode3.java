package ltc.dsf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * need more thinking
 */
public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if(chars.length==0)return 0;
        if(chars.length==1)return 1;
        int res = 0;
        int slow = 0, fast = 1;
        char e;
        LinkedList<Character> list = new LinkedList<>();
        list.offer(chars[0]);
        while(fast<chars.length) {

            if (!list.contains(chars[fast])) {
                list.offer(chars[fast]);
                res = Math.max(res, fast-slow+1);
                fast = fast + 1;
            } else {
                e = chars[fast];
                int k = list.size();
                for (int i = slow; i < k; i++) {
                    if (list.get(i) != e) {
                        slow = slow + 1;
                    } else {
                        slow = slow + 1;
                        break;
                    }
                }
                if (slow == fast) {
                    fast = slow + 1;
                    list.offer(e);
                } else {
                    fast = fast + 1;
                    list.offer(e);
                }
                res = Math.max(res, fast-slow);

            }
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(new LeetCode3().lengthOfLongestSubstring("dvdf"));
        System.out.println(new LeetCode3().lengthOfLongestSubstring("au"));
        System.out.println(new LeetCode3().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new LeetCode3().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LeetCode3().lengthOfLongestSubstring("ynyo"));
        System.out.println(new LeetCode3().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new LeetCode3().lengthOfLongestSubstring("aab"));

    }
}
