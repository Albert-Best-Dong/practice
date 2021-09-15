package HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HJ66 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("reset", "reset what");
        map.put("reset board", "board fault");
        map.put("board add", "where to add");
        map.put("board delete", "no board at all");
        map.put("reboot backplane", "impossible");
        map.put("backplane abort", "install first");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] keys = s.split("[\n]");
            keys[0] = keys[0].split(" ")[0];
            for (int i = 0; i < keys.length; i++) {
                System.out.println(keys[i]);
                getResult(map, keys[i]);
            }
//            getResult(map, s);
        }


//        Set set = map.entrySet();

    }

    private static void getResult(HashMap<String, String> map, String s) {
        int count = 0;
        String res = null;
        for (Map.Entry entry : map.entrySet()
        ) {
            String key = (String) entry.getKey();
            if (key.split(" ").length == s.split("  ").length && s.split(" ").length == 1) {
                if (key.split(" ")[0].charAt(0)==s.charAt(0)) {
                    count++;
                    res = map.get(key);
                } else {
                    res = "unknown command";
                }
            }else if (key.split(" ").length == s.split("  ").length && key.split(" ")[0].charAt(0)==(s.split(" ")[0].charAt(0))&&
                    key.split(" ")[1].charAt(0)==s.split(" ")[1].charAt(0)) {
                count++;
                res = map.get(key);
            }
        }

        if (count == 1) {
            System.out.println(res);
        } else {
            System.out.println("unknown command");
        }
    }
}
