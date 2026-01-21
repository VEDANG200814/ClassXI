import java.util.*;

//1089 output
public class pp2 {
    int freq(String n, char ch) {
        int c = 0;
        for (int i = 0; i < n.length(); i++)
            if (n.charAt(i) == ch)
                c++;
        return c;
    }

    boolean isPresent(String n, String x, String y) {
        for (int i = 0, j = 0; i < n.length(); i++, j++) {
            char xc = x.charAt(j), yc = y.charAt(j), nc = n.charAt(i);
            if ((x.indexOf(nc) == -1 && y.indexOf(nc) == -1) || (n.indexOf(yc) == -1 || n.indexOf(xc) == -1) || freq(n, xc) != freq(x + y, xc) || freq(n, yc) != freq(x + y, yc))
                return false;
            if (x.endsWith("00") || y.endsWith("00") || (x.endsWith("0") && y.endsWith("0")))
                return false;
            if (j == x.length() - 1)
                j = 0;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting and the ending values");
        int m = sc.nextInt(), n = sc.nextInt();
        if (m < n && m >= 1000 && n <= 9999) {
            System.out.println("Vampire numbers are: ");
            int c = 0;
            for (int j = m; j <= n; j++) {
                String as = String.valueOf(j);
                pp2 ob = new pp2();
                if (as.length() % 2 == 0) {
                    int xl = as.length() / 2, i = (int) Math.pow(10, xl) / 10, h = (int) Math.pow(10, xl) - 1, f = 0;
                    for (; i <= h; i++) {
                        if (j % i == 0) {
                            if (ob.isPresent(as, String.valueOf(i), String.valueOf(j / i)) && String.valueOf(i).length() == String.valueOf(j / i).length()) {
                                f = 1;
                                break;
                            }
                        }
                    }
                    if (f == 1) {
                        System.out.print(as + " ");
                        c++;
                    }
                }
            }
            if (c > 0)
                System.out.println("\nFrequency of Vampire numbers: " + c);
            else
                System.out.println("\nNIL");
        } else
            System.out.println("Invalid Input!!");
        sc.close();
    }
}
