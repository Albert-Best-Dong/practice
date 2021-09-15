package ltc;

public class LeetCode338 {
    public int[] countBits(int n) {

        int[] res = new int[n+1];

        for(int i=0;i<=n;i++){
            res[i] = getOneNumber(i);
            System.out.println(res[i]);
        }
        res[0] = 0;
        return res;
    }

    public int getOneNumber(int num){
        int count = 0;
        String s = "";
        for(int i=num;i>0;i/=2){
            s=i%2+s;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new LeetCode338().countBits(5);
    }
}
