import java.util.*;

public class pp3 {
    static int n, key;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("Enter the key");
        key = sc.nextInt();
        sc.close();
    }

    boolean is_valid_key() {
        if (Integer.toString(key).length() != Integer.toString(n).length()) {
            System.out.println("Invalid key length");
            return false;
        }
        int k = key;
        String ks = Integer.toString(k);
        while (k != 0) {
            int d = k % 10;
            String ds = String.valueOf(d);
            if (ks.indexOf(ds) != ks.lastIndexOf(ds)) {
                System.out.println("Not an unique key");
                return false;
            }
            if (d > Integer.toString(n).length()) {
                System.out.println("Invalid key digits");
                return false;
            }
            k /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        pp3 ob = new pp3();
        ob.accept();
        if (ob.is_valid_key()) {
            int arr[] = new int[Integer.toString(n).length()], n1 = n, k = key;
            for (int i = 0; i < arr.length; i++) {
                arr[k % 10 - 1] = n1 % 10;
                n1 /= 10;
                k /= 10;
            }
            System.out.println("Encrypted number:");
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i]);
            System.out.println();
        }
    }
}
