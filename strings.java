import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("hello "+name );

        String a="Ironmann";
        String b="Ironman";
        //CharAt function
        for(int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }


        //compareTo
        //if a>b +ve value how much it is greater
        //if a==b 0
        //if a<b -ve value
        System.out.println(a.compareTo(b));



    }
}
