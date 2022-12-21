package assignment.three;

public class q1 {
    public void sort() {
        int n = 6;
        int a[] = { 0, 0, 1, 1, 0, 0 };
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        q1 q=new q1();
        q.sort();
    }
}
