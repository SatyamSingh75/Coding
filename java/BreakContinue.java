import java.util.*;
public class BreakContinue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("enter your number");
            int n = sc.nextInt();
            if(n%10==0){
               // break;
                continue;
            }
            System.out.println(n);
             sc.close();
    }
    while(true);
   

    } 
}
