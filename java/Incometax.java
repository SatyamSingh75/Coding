import java.util.*;
public class Incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;
        if(income<500000){
            tax = 0;
        }
        else if(income>500000 && income<1000000){
            tax =(int) (0.2*income);

        }
        else{
            tax = (int)(0.3*income);
        }
        System.out.println("Your income tax is: " + tax);
        sc.close();

        }
            
        }

