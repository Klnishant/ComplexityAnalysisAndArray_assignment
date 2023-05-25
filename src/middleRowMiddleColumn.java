import java.util.Scanner;

public class middleRowMiddleColumn {
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

        System.out.println("Element of middle row and middle column:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j==(n-1)/2){
                    System.out.print(arr[i][j]+" ");
                }
                if (i==(n-1)/2)
                {
                    if (j==(n-1)/2){
                        continue;
                    }
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
