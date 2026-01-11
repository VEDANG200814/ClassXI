import java.util.*;

public class pp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keys[] = { "ADGJMPTW ", "BEHKNQUX", "CFILORVY", "SZ" };
        System.out.println("Enter a word");
        String s = sc.next().toUpperCase();
        int keystrokes = 0, f = 1;
        char ch = '\0';
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isLetter(ch) || Character.isWhitespace(ch)) {
                if (keys[0].indexOf(ch) >= 0)
                    keystrokes += 1;
                else if (keys[1].indexOf(ch) >= 0)
                    keystrokes += 2;
                else if (keys[2].indexOf(ch) >= 0)
                    keystrokes += 3;
                else
                    keystrokes += 4;
            } else {
                f = 0;
                break;
            }
        }
        if (f == 1)
            System.out.println("Keystrokes= " + keystrokes);
        else
            System.out.println("Invalid Input!!");
        sc.close();
    }
}
