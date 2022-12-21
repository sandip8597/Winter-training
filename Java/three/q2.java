package assignment.three;
import java.util.*;
public class q2 {
    public void rotate(int arr[], int n, int k){

        if(k>0) {

            while(k>0) {

                int temp = arr[n-1];


                for(int i =n-2;i>=0;i--) {
                    arr[i+1]=arr[i];

                }
                arr[0] = temp;
                k--;
            }


            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else {

            while(k<0) {

                int temp = arr[0];


                for(int i =0;i<n-1;i++) {
                    arr[i]=arr[i+1];

                }
                arr[n-1] = temp;
                k++;
            }


            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        q2 q=new q2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =0;
        int[] arr = new int[n];
        for(int i =0;i<n;i++) {
            System.out.println("Enter: ");
            x = sc.nextInt();
            arr[i]= x;

        }
        System.out.println("Enter k");
        int k = sc.nextInt();
        q.rotate(arr,n,k);
    }
}
