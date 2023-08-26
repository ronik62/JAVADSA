import java.io.*;
public class array2q6 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max element in array is: "+max);
    }
}
