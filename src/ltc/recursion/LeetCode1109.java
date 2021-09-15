package ltc.recursion;

public class LeetCode1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        generateAns(bookings,ans,0);
        return ans;
    }

    public void generateAns(int[][] bookings,int[] ans,int i){
        if(i==bookings.length) return;

        int first = bookings[i][0];
        int last = bookings[i][1];
        int seat = bookings[i][2];
        for(int k = first;k<=last;k++){
            ans[k]=ans[k]+seat;
        }
        generateAns(bookings,ans,++i);
    }

    public static void main(String[] args) {
        int[][] bookings = new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] answer = new LeetCode1109().corpFlightBookings(bookings, 5);
    }
}
