import java.util.*;

public class pp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and coloumns");
        int m = sc.nextInt(), n = sc.nextInt();
        if (m > 0 && m < 10 && n > 2 && n < 6) {
            int arr[][] = new int[m][n], deq[] = new int[m];
            for (int i = 0; i < m; i++) {
                int n1 = n - 1;
                System.out.print("Enter elements for row " + (i + 1) + ": ");
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                    if (arr[i][j] > 7 || arr[i][j] < 0) {
                        System.out.println("Invalid Input!!");
                        System.exit(0);
                    }
                }
                for (int j = 0; j < n; j++) {
                    deq[i] += (int) Math.pow(8, n1) * arr[i][j];
                    n1--;
                }
            }
            System.out.println("Filled Matrix\tDecimal Equivalent");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println(deq[i]);
            }
        } else
            System.out.println("Out of Range!");
        sc.close();
    }
}
