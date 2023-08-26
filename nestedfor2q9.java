public class nestedfor2q9 {
    public static void main(String[] args){
        int x=1;
        
        int rows=3;
        for(int i=1;i<=3;i++){
            int num=rows;
            char ch='C';
            for(int j=1;j<=rows;j++){
                System.out.print((x*x) +""+ (ch--) +""+ (num--) +" ");
                x++;

            }
            System.out.println();
        }
    }
    
}
