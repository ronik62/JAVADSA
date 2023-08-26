import java.io.*;
public class array1q3 {
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size");
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        int mult=1;
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(i%2!=0){
                mult=mult*arr[i];
            }
        }
        System.out.println("Product of odd index: "+mult);
        br.close();
    }
}
