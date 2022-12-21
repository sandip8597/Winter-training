package assignment.three;
import java.util.Scanner;

public class q3 {
    public void minmax(int arr[],int n) {
        int min =arr[0],max = arr[0];

        for(int j = 1;j<n;j++) {
            if(min>arr[j]) {
                min = arr[j];
            }
        }
    }
    public static void main(String[] args) {
        q3 q= new q3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =0;
        int[] arr = new int[n];
        for(int i =0;i<n;i++) {
            System.out.println("Enter: ");
            x = sc.nextInt();
            arr[i]= x;
            q.minmax(arr,n);
        }
    }
}
