import java.util.Scanner;

public class printEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();

        int[] arr =new int[n];

        System.out.print("Enter the element of the array:");
        for (int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Even number of given array:");
        for (int i:arr) {
            if (i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
