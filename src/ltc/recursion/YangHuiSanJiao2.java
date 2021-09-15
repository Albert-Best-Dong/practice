package ltc.recursion;

import java.util.ArrayList;
import java.util.List;

public class YangHuiSanJiao2 {
    List<Integer> res = new ArrayList<>();

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> res = new ArrayList<>();
            res.add(1);
            return res;
        }
        List<Integer> pre  = getRow(rowIndex - 1);
        int len = pre.size();
        for (int i = 0; i <= len; i++) {
            if (i == 0 || i == len) {
                res.add(1);
            } else {

                res.add(pre.get(i - 1) + pre.get(i));

            }

        }
        pre = res;

        res = new ArrayList<>();
        return pre;
    }

//    List<Integer> res = new ArrayList<>();

//    public List<Integer> getRow1(int rowIndex) {
//        if (rowIndex == 0) {
//            List<Integer> res = new ArrayList<>();
//            res.add(1);
//            return res;
//        }
//        List<Integer> pre  = getRow(rowIndex - 1);
//        List<Integer> res = new ArrayList<>();
//
//        int len = pre.size();
//        for (int i = 0; i <= len; i++) {
//            if (i == 0 || i == len) {
//                res.add(1);
//            } else {
//
//                res.add(pre.get(i - 1) + pre.get(i));
//
//            }
//
//        }
//
//        return res;
//    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(new YangHuiSanJiao2().getRow(3));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
