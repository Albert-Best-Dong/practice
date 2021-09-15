public class NumberSquare {
    public int numSquares(int n) {
        int num =(int) Math.sqrt(n);
        int[] arr = new int[num];
        for(int i = 0;i<num;i++){
            arr[i]=(i+1)*(i+1);
        }
        int temp =0,count =0;
        int[] res = new int[num];
        for (int i = 0; i < num; i++) {
            temp = temp+arr[i];
            count++;
            for (int j = num-1; j >= 0; j--) {
                while (temp + arr[j] <= n) {
                    temp = temp+arr[j];
                    count++;
                }
            }
            res[i] = count;
            count = 0;
            temp = 0;
        }
        int t =  Integer.MAX_VALUE;
        for (int i = 0; i < num; i++) {
            t = Math.min(t,res[i]);
        }

        return t;
    }

    public static void main(String[] args) {
        System.out.println(new NumberSquare().numSquares(48));
    }
}
