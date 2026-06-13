import java.util.*;
public class FunctionPrime {
    public static boolean Prime(int n){
        
        if(n==2){
            return true;
        }
        else{
            
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
            return false;
                }
            }
            return true ;

        }
        
    }
        public static void main(String[] ags){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            
        boolean numberisprime=Prime(a);
            System.out.println(numberisprime);
            sc.close();
        }
       
}
