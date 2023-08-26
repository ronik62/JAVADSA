import java.util.*;
public class array1q4{
    public static void main(String[] args){
        Scanner br = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = br.nextInt();
        char arr[]=new char[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=br.next().charAt(0);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
                System.out.println("vowels: "+arr[i]+" ");
            }
            System.out.println();
        }
        br.close();
    }
}