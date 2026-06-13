import java.util.*;
public class FunctionFactorial {
    public static int Factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
int fact=Factorial(n);
System.out.print(fact);
sc.close();
    }

    
}
