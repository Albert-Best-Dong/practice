package nowcoder;

import java.util.Scanner;
class Warrior{
    public boolean wudi;
    public int attack;
    public Warrior(int attack,boolean w) {
        this.attack = attack;
        this.wudi = w;
    }
}
public class Angela {
    public static boolean flag = false;


    public void battle(char[] path, Warrior w) {

        if(w.attack>=1000) return;
        for (int i = 0; i < path.length; i++) {
           if(path[i]=='B'){
               if(w.attack>1000||w.wudi) {
                   flag = true;
                   return;
               }
           }

           if(path[i]=='G'){
               if(w.attack>10000)
                   w.attack=10000;
               else
                   w.attack = w.attack * 2;
           }
            if (path[i] == 'S') {
                w.wudi = true;
            }
            if(path[i]=='T')continue;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] p = s.toCharArray();
        Warrior w = new Warrior(100, false);

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
