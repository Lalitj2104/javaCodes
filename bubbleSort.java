import java.util.*;

public class bubbleSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr= new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<x-1;i++){
            for(int j=0;j<x-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                }
            }
        }
        printArray(arr);
    }
}
