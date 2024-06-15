import java.util.*;

public class evenoddNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x==0){
            System.out.println("either odd or even as number is zero");
        } else if(x%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}
