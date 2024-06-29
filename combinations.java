import java.util.*;

public class combinations {
        public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

        public static void keypadscomb(String s,int idx,String combi) {
            if(idx==s.length()){
                System.out.println(combi);
                return;

            }
            char curr=s.charAt(idx);
            String mapping =keypad[curr-'0'];
            for(int i=0;i<mapping.length();i++){
                keypadscomb(s,idx+1,combi+mapping.charAt(i));
            
            }
        }
        

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        keypadscomb(s,0,"");
    }    
}
