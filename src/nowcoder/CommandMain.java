package nowcoder;

import java.util.Scanner;

public class CommandMain {
    public static void main(String[] args) {

        String[][] command = new String[6][2];
        command[0][0] = "reset";
        command[0][1] = null;

        command[1][0] = "reset";
        command[1][1] = "board";

        command[2][0] = "board";
        command[2][1] = "add";

        command[3][0] = "board";
        command[3][1] = "delete";

        command[4][0] = "rebot";
        command[4][1] = "backplane";

        command[5][0] = "backplane";
        command[5][1] = "abort";

        Scanner sc = new Scanner(System.in);
        String cmd = "";
        while (sc.hasNext()) {

            String s = sc.nextLine();
            int count = 0;
            String[] ss = s.split(" ");
            if(ss.length>2)                 System.out.println("unknown command");
            if (ss.length == 1) {
                if (command[0][0].contains(ss[0])) {
                    cmd = command[0][0];
                } else {
                    cmd = s;
                }
            } else {
                for (int i = 1; i < command.length; i++) {

                    if (command[i][0].contains(ss[0]) && command[i][1].contains(ss[1])) {
                        count = count + 1;
                        if (count == 1) {
                            cmd = command[i][0] + " " + command[i][1];
                        }
                    }
                }

                if (count != 1) {
                    cmd = s;
                }
            }


            switch (cmd) {
                case "reset":
                    System.out.println("reset what");
                    break;
                case "reset board":
                    System.out.println("board fault");
                    break;
                case "board add":
                    System.out.println("where to add");
                    break;
                case "board delete":
                    System.out.println("no board at all");
                    break;
                case "reboot backplane":
                    System.out.println("impossible");
                    break;
                case "backplane abort":
                    System.out.println("install first");
                    break;
                    default:
                        System.out.println("unknown command");
            }

        }

    }
}
