import java.util.*;

public class pp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in HH:MM A.M./P.M. format");
        String t = sc.nextLine().toUpperCase(), ht = "";
        int c = t.indexOf(':'), h = 0, m = 0;
        if (c >= 0){
            h = Integer.parseInt(t.substring(0, c));
            m = Integer.parseInt(t.substring(c + 1, c + 3));
        }
        if (h >= 1 && h <= 12) {
            if (t.endsWith("A.M.")) {
                if (h == 12)
                    ht += "00:";
                else if (h <= 9)
                    ht += "0" + String.valueOf(h) + ":";
                else
                    ht += String.valueOf(h) + ":";
            } else if (t.endsWith("P.M.")) {
                if (h == 12)
                    ht += "12:";
                else
                    ht += String.valueOf(h + 12) + ":";
            }
        }
        if (ht.equals("") == false)
            System.out.println("24-hour clock: " + ht + (m == 0 ? String.valueOf(m) : "00"));
        else
            System.out.println("Invalid Input!!");
        sc.close();
    }
}
