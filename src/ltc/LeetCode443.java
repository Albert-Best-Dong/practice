package ltc;

import ltc.recursion.LeetCode344;

public class LeetCode443 {
    public int compress(char[] chars) {
        int len = chars.length;
        String res;
        int count = 0;
        StringBuilder sb =new StringBuilder();
        for(int i=0;i< len;i++){

            int j=i+1;
            sb.append(chars[i]);
            while(j<len){
                if(chars[j]==chars[i]){
                    count=count+1;
                    j++;
                }else{
                    count=count+1;
                    if(count!=1){
                        String ss = String.valueOf(count);
                        for(int k = 0;k<ss.length();k++){
                            sb.append(ss.charAt(k));
                        }
                    }

                    count = 0;
                    i=j-1;
                    break;
                }
            }
            if(j==len) break;
        }
        if(count!=1){
            count = count+1;
            String ss = String.valueOf(count);
            for(int k = 0;k<ss.length();k++){
                sb.append(ss.charAt(k));
            }
        }
        res = sb.toString();
        System.out.println(res);

        chars = res.toCharArray();
        chars[0] = 0;
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }
        return chars.length;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b','b', 'b', 'b', 'b', 'b', 'b'};
        new LeetCode443().compress(chars);
    }
}
