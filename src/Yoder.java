import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Yoder {
    public static void main(String[] args) {
        String s=null,h=null;
        String regx = "[a-zA-Z0-9]";
        int count = 0;
        Pattern pattern = Pattern.compile(regx);

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            s = scanner.next();
            h = scanner.next();
        }

        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            Matcher matcher = pattern.matcher(temp);
            if (matcher.find()) {
                s.replace(s.charAt(i), '1');
                if (h.charAt(i) == '1') {
                    count++;
                }
            }else{
                s.replace(s.charAt(i), '0');
                if (h.charAt(i) == '0') {
                    count++;
                }
            }
        }
        System.out.println(count/s.length());

    }
}


