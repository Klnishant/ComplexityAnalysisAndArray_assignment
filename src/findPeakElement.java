import java.util.Scanner;

public class findPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i-1]<arr[i] && arr[i]>arr[i+1])
            {
                System.out.println("First peak element of this array:"+arr[i]);
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("No any peak element found in this array");
        }
    }
}
