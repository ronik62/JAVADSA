import java.util.*;
public class array2q5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min element is: "+min);
        sc.close();
        
       
    }
}
