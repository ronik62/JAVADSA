import java.io.*;
public class array2q7 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter array1 size: ");
        int m=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        int arr1[]=new int[m];
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter array1 elements: ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("common elements: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

        

    }
}
