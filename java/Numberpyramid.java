public class Numberpyramid {
    public static void Pyramid(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(counter  );
                counter++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
Pyramid(4);
    }

    
}
