package assignment.one;

public class q1 {
    public static void main(String[] args) {
        String s="sandip";
        char []s_array=s.toCharArray();
        for (int i=0; i<s.length(); i++){
            for (int j=0; j<s.length(); j++){
                if(s_array[i]<s_array[j]){
                    char temp=s_array[i];
                    s_array[i]=s_array[j];
                    s_array[j]=temp;
                }
            }
        }
        System.out.println(s_array);
    }
}