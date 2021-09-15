package Te;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
//        Integer[] nums =(Integer[]) set.toArray();
        System.out.println(set.size());
        int[] a;
        String s;
        List<Integer> list = new ArrayList<>();
        Collections.sort(list);

    }
}
