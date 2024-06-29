import java.util.*;
public class invitePeople {
    public static int invite(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int way1=invite(n-1);
        int way2=(n-1)*invite(n-2);
        return way1+way2;

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(invite(n));
    }
}
