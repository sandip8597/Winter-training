package assignment.one;

public class q3 {
    public static void main(String[] args) {
        int s = 0, t = 1, i=0, j;
//        for (i = 0; i < 10; i++) {
//            s = s + i;
//            for (j = i; j > 0; j--) {
//                t = t * (j - i);
//            }
//            s = s * t;
//            System.out.println("T is " + t);
//        }
//        System.out.println("S is " + s);
        while(i<10){
            s+=i;
            j=i;
            while(j>0){
                t*=(j-i);
                j--;
            }
            s*=t;
            i++;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);
    }
}
