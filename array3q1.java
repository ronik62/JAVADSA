import java.util.*;
public class array3q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            int temp=arr[i];
            while(temp!=0){
                count++;
                temp=temp/10;
                
            }
            System.out.println("count of digit in number"+arr[i]+"="+count);
        }
        
        sc.close();
    }
}
