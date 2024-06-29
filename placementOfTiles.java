import java.util.*;
public class placementOfTiles {
    public static int placeTiles(int m,int n){
        if(n==m){
            return 2;
        }
        if(n>m){
            return 1;
        }
        int vert = placeTiles(m-n, n);
        int hori = placeTiles(m-1, n);


        return vert+hori;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(placeTiles(m, n));

    }
    
}
