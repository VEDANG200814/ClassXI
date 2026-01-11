import java.util.*;

public class pp12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions");
        int m = sc.nextInt();
        if (m > 2 && m < 10) {
            int a[][] = new int[m][m];
            int b[][] = new int[m][m];
            int i, j, l, s = 0;
            for (i = 0; i < m; i++)
                for (j = 0; j < m; j++)
                    a[i][j] = sc.nextInt();
            System.out.println("Original matrix");
            for (i = 0; i < m; i++) {
                for (j = 0; j < m; j++)
                    System.out.print(a[i][j] + "\t");
                System.out.println();
            }
            System.out.println("Rotated matrix:");
            for (i = 0, l = m - 1; i < m; i++, l--) {
                for (j = 0; j < m; j++)
                    b[j][l] = a[i][j];
            }
            for (i = 0; i < m; i++) {
                for (j = 0; j < m; j++)
                    System.out.print(b[i][j] + "\t");
                System.out.println();
            }
            System.out.print("Sum of four corner elements of DDA: ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < m; j++)
                    if ((i == 0 || i == m - 1) && (j == 0 || j == m - 1))
                        s += b[i][j];
            }
            System.out.println(s);
            sc.close();
        } else
            System.out.println("Wrong Input!!");
    }
}
