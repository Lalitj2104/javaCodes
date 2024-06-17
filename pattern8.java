import java.util.*;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int z=0;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                ++z;
                System.out.print(z );
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
