public class nestedfor2q10 {
    public static void main(String[] args){
        for(int i=1;i<=6;i++){
            char ch='F';
            int num=5;
            for(int j=1;j<=6;j++){
                if(j%2==0){
                    System.out.print(num +" ");
                    num=num-2;
                }
                else{
                    System.out.print(ch-- +" ");
                    ch--;
                }

            }
            System.out.println();
        }
    }
    
}
