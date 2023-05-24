import java.util.Scanner;

public class sumOfEvenIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the element of the array:");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum=0;

        for (int i=0; i<n; i+=2)
        {
            sum=sum+arr[i];
        }

        System.out.println("Sum of the even indexes of the given array:"+sum);
    }
}
