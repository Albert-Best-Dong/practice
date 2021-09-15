public class DiGui {
    static String ss ="b";
    String a = new String("a");

    public static void show(int n) {
        if (n == 0) {

            System.out.println("0");
            return;
        }

        n = n - 1;
        show(n);
        if (n % 2 == 0) {

            System.out.println(n + "Yes");

        }

        return;
    }

    public void change(String str) {
        str = ss;
        ss = str;
    }

    public static void main(String[] args) {
        //show(7);
        DiGui dg = new DiGui();
        dg.change(dg.a);
        System.out.println(dg.a+" "+dg.ss);
    }
}
