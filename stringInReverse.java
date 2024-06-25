import java.util.*;

public class stringInReverse{
    public static void reverseString(String x,int index){
        if(index==-1){
            return;
        }
        System.out.print(x.charAt(index));
        reverseString(x, index-1);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String x=sc.next();
         int index=x.length();
         reverseString(x, index-1);
    }
}