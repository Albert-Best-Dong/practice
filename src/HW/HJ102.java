package HW;

import java.util.*;

public class HJ102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (map.containsKey(chars[i])) {
                    map.put(chars[i], map.get(chars[i]) + 1);
                } else map.put(chars[i], 1);
            }

            List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
                @Override
                public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                    if (o1.getValue() < o2.getValue()) {
                        return 1; //返回正数说明 o1 o2 要交换
                    } else if (o1.getValue() == o2.getValue()) {
                        if (o1.getKey() < o2.getKey()) {
                            return -1;
                        } else {
                            return 1;
                        }

                    } else {
                        return -1; //返回负数说明 o1 o2不要交换
                    }
                }
            });
            for (Map.Entry<Character, Integer> entry :
                    list) {
                System.out.println(entry.getKey());
            }
        }

    }
}
