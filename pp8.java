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
        System.out.println("Enter a word: ");
        String s = sc.nextLine(), w = "",ns="";
        StringTokenizer st = new StringTokenizer(s.substring(0,s.length()-1));
        if ("!.?".indexOf(s.charAt(s.length() - 1)) >= 0) {
            while (st.hasMoreTokens()) {
                w=st.nextToken();
                if (w.equalsIgnoreCase(ob.palin(w)))
                    ns+=w+" ";
                else
                    ns+=w+ob.palin(w).substring(1)+" ";
            }
            System.out.println("Original sentence: "+s);
            System.out.println("Converted sentence: "+ns.trim());
        }
        sc.close();
    }
}
