import java.util.*;
public class array2q10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array1 size: ");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            int temp=arr1[i];
            while(temp!=0){
                int rem=temp%10;
                sum=sum+rem;
                temp=temp/10;
            }
            if(sum%2==0){
                System.out.println(arr1[i]);
            }
            sum=0;
            sc.close();
        }
    }
}
