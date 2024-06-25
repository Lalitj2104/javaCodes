import java.util.*;
public class placeAtLast{
    public static void occurence(String x,int z,String a,int  c){
        if(z==x.length()){
            for(int i=0;i<c;i++){
                a+='x';
            }
            System.out.println(a);
            return;
        }
        if(x.charAt(z)=='x'){
            c++;
            occurence(x,z+1,a,c);
        }
        else{
            a+=x.charAt(z);
            occurence(x,z+1,a,c);
        }
       

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String a="";
        occurence(x,0,a,0);
        

    }
}