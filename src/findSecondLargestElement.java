import java.util.Scanner;

public class findSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max;
        int secondMax;
        max=secondMax=Integer.MIN_VALUE;

        for (int i : arr) {
            max = Math.max(i,max);
        }

        for (int i: arr) {
            if (i!=max){
                secondMax = Math.max(i,secondMax);
            }
        }

        System.out.println("Second largest value of the given array:"+secondMax);
    }
}
