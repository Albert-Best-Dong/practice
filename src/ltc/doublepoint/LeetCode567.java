package ltc.doublepoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LeetCode567 {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int count = 0;
        if(len1>len2) return false;
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();

        for(char c:s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int i = 0;

        for (char c:s2.toCharArray()) {
            if (map1.equals(map2)) {
                return true;
            }

            if(i<len1){
                map2.put(c, map2.getOrDefault(c, 0) + 1);
                i = i + 1;
            }else{
                map2.put(c, map2.getOrDefault(c, 0) + 1);
                if(!map1.containsKey(s2.charAt(count)))
                    map2.remove(s2.charAt(count), map2.get(s2.charAt(count)));
                else
                    map2.put(s2.charAt(count), map2.get(s2.charAt(count)) - 1);

                count = count + 1;
            }

        }

        if (map1.equals(map2)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new LeetCode567().checkInclusion("trinitrophenylmethylnitramine", "dinitrophenylhydrazinetrinitrophenylmethylnitramine"));

        System.out.println(new LeetCode567().checkInclusion("ab", "eidboaoo"));
    }
}
