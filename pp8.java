import java.util.*;

public class pp8 {
    String palin(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--)
            s1 = s1 + s.charAt(i);
        return s1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pp8 ob = new pp8();
        System.out.println("Enter a sentence in Upper Case only: ");
        String s = sc.nextLine().toUpperCase(), w = "", ns = "";
        StringTokenizer st = new StringTokenizer(s.substring(0, s.length() - 1));
        if ("!.?".indexOf(s.charAt(s.length() - 1)) >= 0 && s.contains("  ") == false) {
            while (st.hasMoreTokens()) {
                w = st.nextToken();
                if (w.equalsIgnoreCase(ob.palin(w)))
                    ns += w + " ";
                else
                    ns += w + ob.palin(w).substring(1) + " ";
            }
            System.out.println("Original sentence: " + s);
            System.out.println("Converted sentence: " + ns.trim());
        }
        else
            System.out.println("InvalidInput!!");
        sc.close();
    }
}
