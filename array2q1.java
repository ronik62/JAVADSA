import java.io.*;
public class array2q1{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("number of elements in array: ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter array elements: ");
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}