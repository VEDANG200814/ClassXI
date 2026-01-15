import java.util.*;

class pp1 {
    int reverse(int n) {
        int n1 = 0;
        while (n > 0) {
            n1 = n1 * 10 + n % 10;
            n /= 10;
        }
        return n1;
    }

    boolean isPrime(int n) {
        int c = 0;
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    boolean isAdam(int n) {
        int sq = n * n, sq1 = reverse(sq), n1 = reverse(n), sqr = n1 * n1;
        if (sq1 == sqr)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the starting and the ending values");
        int m = sc.nextInt();
        int n = sc.nextInt(), c = 0;
        pp1 ob = new pp1();
        System.out.println("The Prime-Adam Integers are:");
        if (m < n) {
            for (int i = m; i <= n; i++) {
                if (ob.isAdam(i) && ob.isPrime(i)) {
                    System.out.print(i + " ");
                    c++;
                }
            }
            if (c == 0)
                System.out.println("NIL");
            System.out.println("\nThe Frequency of Prime-Adam numbers is: " + c);
        }
        sc.close();
    }
}