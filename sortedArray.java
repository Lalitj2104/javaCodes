import java.util.*;

public class sortedArray {
    public static boolean sorted(int arr[],int index){
        if(index==arr.length-1){
            return true;

        }
        if(arr[index]<arr[index+1]){
            return sorted(arr,index+1);
        }else{
            return false;
        }

    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int []arr=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sorted(arr,0));

    }
}
