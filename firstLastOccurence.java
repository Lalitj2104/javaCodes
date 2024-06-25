import java.util.*;
public class firstLastOccurence{
    public static  void occurence(String x,int index,int first,int last,char ele){
        if(index==x.length()){
            System.out.println("First occurence is at :"+first);
            System.out.println("last occurence is at: "+ last);
            return;
        }

        if(x.charAt(index)==ele){
            if(first == -1){
                first=index;
            }
            else{
                last =index;
            }
        }

        occurence(x, index+1, first, last, ele);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        occurence(x,0,-1,-1,'a');

    }
}