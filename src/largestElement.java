import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the matrix");
        int m = sc.nextInt();
        System.out.println("Enter the column of the matrix:");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter the element of the matrix:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] =sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(arr[i][j],max);
            }
        }
        System.out.println("Largest element of the array:"+max);
    }
}
