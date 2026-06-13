import java.util.*;
public class AverageFunction {
    public static int Average(int x,int y,int z){
        int Avg=(x+y+z)/3;
        return Avg;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Averageofthree=Average(a,b,c);
        System.out.println(Averageofthree);
        sc.close();
    }
    
}
