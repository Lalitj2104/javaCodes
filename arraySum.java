import java.util.*;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        int q= 0;
        for(int i=0;i<4;i++){
                q+=arr[i];
            // System.out.println(arr[i]);
        }
        System.out.println(q);
    }
}
