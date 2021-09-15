import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int isPrime(int target) {
        boolean flag = false;
        for (int i = 2; i <= target/2 ; i++) {
            if (target % i == 0) {
                flag= true;
                break;
            }
        }
        if (flag) {
            return 0;
        } else {
            return target;
        }
    }

    public static void main(String[] args) {
        int a=0,b=0;
        ArrayList result = new ArrayList();
        Scanner in = new Scanner(System.in);
        try {
            while (in.hasNext()) {
                a = in.nextInt();
                String s = in.next();
                if (s != ",") {
                    break;
                }
                b = in.nextInt();

            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        for (int k = a; k <= b; k++) {
            if(isPrime(k)!=0){
                result.add(k);
            }
        }
        System.out.println(result);
    }
}
