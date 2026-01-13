import java.util.*;

public class pp11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range");
        int m = sc.nextInt();
        System.out.println("Enter the sum of the digits");
        int n = sc.nextInt(), s = 0, sd = 0;
        if (m >= 100 && m <= 10000 && n < 100) {
            while (s != n && m <= 10000) {
                int m1 = m;
                sd = 0;
                while (m1 != 0) {
                    s += m1 % 10;
                    sd++;
                    m1 /= 10;
                }
                if (s != n)
                    s = 0;
                m++;
            }
            if (m <= 10000) {
                System.out.println("The required number is: " + (--m));
                System.out.println("Total number of digits: " + sd);
            } else
                System.out.println("Range exceeded!!");
        } else
            System.out.println("Invalid Input!!");
        sc.close();
    }
}
