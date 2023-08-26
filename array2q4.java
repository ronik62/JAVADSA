import java.io.*;
public class array2q4 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter array elements: ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter element to search: ");
        int search=Integer.parseInt(br.readLine());
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("Element found at index: "+i);
            }
        }

    }
}
