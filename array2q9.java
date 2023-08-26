import java.util.*;
public class array2q9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array1 size: ");
        int n=sc.nextInt();
        System.out.println("Enter array1 elements: ");
        int arr1[]=new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter array2 size: ");
        int m=sc.nextInt();
        System.out.println("Enter array2 elements: ");
        int arr2[]=new int[m];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        
        int arr3[]=new int[n+m];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[n+i]=arr2[i];
        }
        System.out.println("merged array is");
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
        sc.close();
    }
}
