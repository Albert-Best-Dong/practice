package ltc;

public class LeetCode1588 {
    int s = 0;
    public int sumOddLengthSubarrays(int[] arr) {

        dfs(arr,0,0);
        return s;
    }

    public void dfs(int[] arr,int i, int j){
        if(i==arr.length) return;
        if(j==arr.length) return;
        if((j-i+1)%2==1){
            sum(arr,i,j);
        }
        dfs(arr,i,++j);
        if(j==arr.length){
            i=i+1;
            dfs(arr,i,i);
        }

    }

    public void sum(int[] arr,int i,int j){
        while(i<=j){
                s=s+arr[j--];
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode1588().sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
    }
}
