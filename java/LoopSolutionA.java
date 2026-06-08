import java.util.*;
public class LoopSolutionA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
                int oddsum = 0;
        do{
            System.out.print("enter the number");
            number = sc.nextInt();
            if(number%2==0){
                evensum =evensum + number;
                System.out.println("evensum");
            }
            else{
                oddsum = oddsum + number;
                System.out.println("oddsum");
            }
            System.out.print("Do you want to continue ? press1 for yes or press 0 for no");
            choice = sc.nextInt();

        }
        while(choice==1);
        System.out.println(evensum);
        System.out.println(oddsum);
        sc.close();
        }
    }
    

