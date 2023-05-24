import java.util.Scanner;

public class findMaxElement {

    public static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i:arr) {
            max = Math.max(i,max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Maximum element of the array:"+findMax(arr));
    }
}
