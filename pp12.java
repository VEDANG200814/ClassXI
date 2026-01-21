import java.util.*;

public class pp12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions");
        int m = sc.nextInt(), n = sc.nextInt();
        if (m > 2 && n > 2 && n < 10 && m < 10) {
            int a[][] = new int[m][n];
            int b[][] = new int[m][n];
            int i, j, l, s = 0;
            System.out.println("Enter the matrix elements");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();
            System.out.println("Original matrix");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(a[i][j] + "\t");
                System.out.println();
            }
            System.out.println("Mirror matrix:");
            for (i = 0; i < m; i++) {
                for (j = 0, l = n - 1; j < n; j++, l--)
                    b[i][l] = a[i][j];
            }
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(b[i][j] + "\t");
                System.out.println();
            }
            System.out.print("Sum of four corner elements of DDA: ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    if ((i == 0 || i == m - 1) && (j == 0 || j == n - 1))
                        s += b[i][j];
            }
            System.out.println(s);
            sc.close();
        } else
            System.out.println("Wrong Input!!");
    }
}
