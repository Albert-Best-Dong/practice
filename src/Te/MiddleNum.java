package Te;

import java.util.*;

/**
 *  5 1 5 3 5 2 5 5 7 6 7 3 7 11 7 55 7 9 98 9 17 9 15 9 9 1 39
 */
public class MiddleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] ss = s.split(" ");
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ss.length; i++) {

            if (!map.containsKey(Integer.valueOf(ss[i]))) {
                map.put(Integer.valueOf(ss[i]), 1);
            } else {
                map.put(Integer.valueOf(ss[i]), map.get(Integer.valueOf(ss[i])) + 1);

            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey());
                set.add(entry.getKey());
            }
        }

        Object[] o = set.toArray();

        System.out.println(o[set.size()/2]);
    }
}
