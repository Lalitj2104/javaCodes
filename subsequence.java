import java.util.*;

public class subsequence {
     public static void subsequences(String s,int idx,String str){
        if(idx==s.length()){
            System.out.println(str);
            return;
        }
        char curr=s.charAt(idx);

        //pick
        subsequences(s, idx+1, str+curr);

        //not pick
        subsequences(s, idx+1, str);
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        subsequences(s, 0, "");
        
    }
}
