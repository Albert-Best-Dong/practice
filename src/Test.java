import java.util.*;

public class Test {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        int c = (int) (Math.log10(20)+1);
        double d = Math.pow(10,1);
        System.out.println(c+" "+d);
        HashMap map = new HashMap();
        map.put(1,2);
        map.put(2, 4);

        HashSet set = new HashSet();

        Iterator it  = map.values().iterator();
        ArrayList list = (ArrayList) map.values();

        for (int i = 0; i < list.size(); i++) {

        }

        ArrayList l = new ArrayList();
        
        System.out.println(map.values());
    }

    private static void operator(StringBuffer a, StringBuffer b) {
        a.append(b);b=a;


    }
}
