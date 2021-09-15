package ltc.dynamic_programming;

/**
 * 有问题
 */
public class Offer48 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0,right = left+1;
        int max = 0;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(i)) break;
                else{
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Offer48().lengthOfLongestSubstring("abcabcbb"));

    }
}
