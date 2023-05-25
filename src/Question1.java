import java.util.Scanner;

public class Question1 {
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

        int positive_num=0;
        int negative_num=0;
        int odd_num=0;
        int even_num=0;
        int zeros=0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]>0){
                    positive_num++;
                }
                if (arr[i][j]<0){
                    negative_num++;
                }
                if (arr[i][j]==0){
                    zeros++;
                }
                if (arr[i][j]%2==0){
                    even_num++;
                }
                if (arr[i][j]%2 !=0){
                    odd_num++;
                }
            }
        }

        System.out.println("Number of positives number:"+positive_num);
        System.out.println("Number of negatives number:"+negative_num);
        System.out.println("Number of even number:"+even_num);
        System.out.println("Number of odd number:"+odd_num);
        System.out.println("Number of zeros:"+zeros);
    }
}
