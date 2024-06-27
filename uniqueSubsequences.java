import java.util.*;

public class uniqueSubsequences {
    public static void uniqueSubsequence(String s,int idx,String str,HashSet<String> set) {
        if(idx==s.length()){
            if(set.contains(str)){
                return;
            }
            else{
                System.out.println(str);
                set.add(str);
                return;

            }
        }
        char curr=s.charAt(idx);

        uniqueSubsequence(s, idx+1, str+curr, set);

        uniqueSubsequence(s, idx+1, str, set);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashSet<String> set =new HashSet<>();
        uniqueSubsequence(s,0,"",set);

    }    
}
