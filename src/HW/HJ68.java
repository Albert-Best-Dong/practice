package HW;

import java.util.*;

/**
 * 描述
 * 查找和排序
 *
 * 题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
 * 都按先录入排列在前的规则处理。
 *
 * 例示：
 * jack      70
 * peter     96
 * Tom       70
 * smith     67
 *
 * 从高到低  成绩
 * peter     96
 * jack      70
 * Tom       70
 * smith     67
 *
 * 从低到高
 *
 * smith     67
 *
 * jack      70
 *
 * Tom       70
 * peter     96
 *
 * 注：0代表从高到低，1代表从低到高
 *
 * 本题含有多组输入数据！
 * 输入描述：
 * 输入多行，先输入要排序的人的个数，然后分别输入他们的名字和成绩，以一个空格隔开
 *
 * 输出描述：
 * 按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开
 */
public class HJ68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = null;
        Integer index = null;
        int count = 0;
        List<Student> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            if (sc.hasNextInt() && n == null) {
                n = Integer.valueOf(sc.nextLine());
            } else if (sc.hasNextInt() && n != null) {
                index = Integer.valueOf(sc.nextLine());
            } else {
                String tmp = sc.nextLine();
                String[] r = tmp.split(" ");
                list.add(new Student(r[0], Integer.valueOf(r[1]),  count++));
                if (count < n) {
                    continue;
                }
            }


            Integer finalIndex = index;
            Collections.sort(list, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if (finalIndex == 0) {
                        if (o1.score==o2.score) return 0;
                        return o1.score - o2.score > 0 ? -1 : 1;
                    }
                    if (finalIndex == 1) {
                        if (o1.score==o2.score) return 0;
                        return o2.score - o1.score < 0 ? 1 : -1;
                    }
                    return 0;
                }
            });

            for (Student l: list
                 ) {
                System.out.println(l.name + " " + l.score);
                n = null;
                index = null;
                count = 0;
                list = new ArrayList<>();
            }

        }

    }

    public static class Student {
        public String name;
        public Integer score;
        public int position;

        public Student(String name, Integer score, int position) {
            this.name = name;
            this.score = score;
            this.position = position;
        }

    }

}
