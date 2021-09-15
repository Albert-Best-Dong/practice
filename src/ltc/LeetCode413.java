package ltc;

public class LeetCode413 {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length==0||A.length==1||A.length==2) return 0;

        int index = 0;
        int d = A[1]-A[0];
        int count=0;

        for (int i = 2; i < A.length; i++) {

            for (int j = 0; j < i; j++) {
                int[] subA = new int[i+1];
                for (int k = j; k < j+i; k++) {
                    subA[index++] = A[k];
                    if (isArithmeticSlices(subA)) {
                        count++;
                    }
                }
                index = 0;
            }
        }

        return count;
    }

    public boolean isArithmeticSlices(int[] subA){
        int i = 0;
        int d = subA[1] - subA[0];
        for (i = 0; i < subA.length-1; i++) {
            if (subA[i+1]-subA[i]==d) continue;
            else break;
        }
        if(i==subA.length-2) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode413().numberOfArithmeticSlices(
                new int[]{1,2,3}));
    }
}
