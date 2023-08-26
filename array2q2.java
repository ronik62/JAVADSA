import java.io.*;
public class array2q2 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter array elements: ");
        int arr[]=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int num1=0;
        int num2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                num1++;
            }
            else{
                num2++;
            }
        }
        System.out.println("even elements: "+ num1);
        System.out.println("odd elements: "+ num2);
        
    }
}
