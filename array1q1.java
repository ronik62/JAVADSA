import java.io.*;
public class array1q1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size: ");
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        int sum=0;
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]%2!=0){
                sum=sum+arr[i];
            }
        }
        System.out.println("The sum of odd elements: "+sum);
    }
}
