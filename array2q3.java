import java.io.*;
public class array2q3 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        int oddsum=0;
        int evensum=0;
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]%2==0){
                evensum=evensum+arr[i];
            }
            else{
                oddsum=oddsum+arr[i];
            }
        }
        System.out.println("even numbers sum: "+evensum);
        System.out.println("odd numbers sum: "+oddsum);
       
    }
}
