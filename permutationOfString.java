import java.util.*;

public class permutationOfString {
    public static void permutation(String s, String str) {

        if(s.length()==0){
            System.out.println(str);
            return;
        }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);

            String newstr=s.substring(0,i)+s.substring(i+1);
            permutation(newstr, str+curr);
        }


        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        permutation(s,"");
    }
}
