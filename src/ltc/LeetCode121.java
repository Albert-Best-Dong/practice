package ltc;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int minPrice =  Integer.MAX_VALUE;

        int max = 0;
        for(int i=0;i<len;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
                System.out.print("minPrice:"+minPrice);

            } else if (prices[i] - minPrice > max) {
                System.out.println();
                max = prices[i] - minPrice;
                System.out.print("max:" + max);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        new LeetCode121().maxProfit(new int[]{7,6,4,3,1,2,3,4,5});

    }
}
