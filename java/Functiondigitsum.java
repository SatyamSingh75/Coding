import java.util.*;
public class Functiondigitsum {
    public static int SumOfDigit(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int isSum=SumOfDigit(a);
        System.out.println(isSum);
        sc.close();
    }
    
}
