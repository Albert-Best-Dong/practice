package ltc;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode914 {
    boolean flag = false;
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length==1)return false;
        Arrays.sort(deck);
        int x = 2;
        check(deck,2);
        return flag;
    }

    public void check(int[] deck,int x){
        if(x==deck.length) return;

        for(int i=0;i<deck.length;i=i+x){

            if(i+x-1<deck.length&&deck[i]==deck[i+x-1]){
                if(i+x==deck.length) {
                    flag = true;
                    return;
                }
                continue;
            }
            else break;
        }

        x=x+1;
        check(deck,x);
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode914().hasGroupsSizeX(new int[]{1,1,1}));
    }
}
