import java.util.*;

public class insertionSort {
    static public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int []arr =new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<x;i++){
            int curr=arr[i];
            int j=i-1;

            while(j>=0 && curr <arr[j]){
                arr[j+1]=arr[j];
                j--;
            }


            arr[j+1]=curr;
        }
        printArray(arr);


    }
}
