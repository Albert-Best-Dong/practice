package nowcoder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class NC41 {
    public int maxLength (int[] arr) {
        // write code here
        Queue<Integer> queue = new LinkedList<>();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (queue.contains(arr[i])) {
                while (queue.contains(arr[i])) {
                    queue.remove();
                }
                queue.offer(arr[i]);

            } else {
                queue.offer(arr[i]);
            }

            res = Math.max(queue.size(), res);

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,3,2,1,3,3,3,1};
        System.out.print(new NC41().maxLength(arr));
    }
}
