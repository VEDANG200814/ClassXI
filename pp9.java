import java.util.*;

public class pp9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to be encrypted");
        String s = sc.nextLine(), w = "";
        if (s.length() >= 3 && s.length() <= 100) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLetter(ch)) {
                    if ((ch >= 78 && ch <= 90) || (ch >= 110 && ch <= 122))
                        w += (char) (ch - 13);
                    else
                        w += (char) (ch + 13);
                } else
                    w += ch;
            }
            System.out.println("The cipher text is:\n" + w);
        } else
            System.out.println("Invalid Length!!");
        sc.close();
    }
}
