public class RotatedHaifPyramid {
    public static void  InvertedHalf(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
                counter++;
            }
            System.out.println();
        }
    }
        public static void main(String[] args){
            InvertedHalf(5);
            
        }
    
    
}
