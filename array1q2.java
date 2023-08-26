import java.util.*;
public class array1q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int mult=1;
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                mult=mult*arr[i];
            }

        }
        System.out.println("Product of even elements: "+mult);
        sc.close();
    }
}
