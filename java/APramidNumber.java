public class APramidNumber {
    public static void  Number(int n){
        
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);

            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Number(4);
    }
}
