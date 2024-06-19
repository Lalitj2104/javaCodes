import java.util.*;

public class arraySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int [] arr=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number u want to search");
        int y=sc.nextInt();
        for(int i=0;i<x;i++){
            if(arr[i]==y){
                System.out.println("element is at index "+i);
                break;
            }
        }

    }
}
