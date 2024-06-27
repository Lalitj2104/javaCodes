import java.util.*;

public class removeDuplicate {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicates(String s,int index,String str){
        if(index==s.length()){
            System.out.println(str);
            return;
        }
        char curr=s.charAt(index);
        if(map[curr-'a']==true){
            removeDuplicates(s, index+1, str);
        }
        else{
            str+=curr;
            map[curr-'a']=true;
            removeDuplicates(s, index+1, str);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        removeDuplicates(s,0,"");
    }
    
    

}
