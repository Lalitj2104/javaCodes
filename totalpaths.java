import java.util.*;  
public class totalpaths {

    public static int countPaths(int i,int j,int n,int m){
        if(i==n ||j==m){
            return 0;
        }
        if(i==n-1 ||j==m-1){
            return 1;
        }

        int down=countPaths(i+1, j, n, m);

        int right=countPaths(i, j+1, n, m);
        return  down +right;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(countPaths(0, 0, n, m));


    }
    
}
