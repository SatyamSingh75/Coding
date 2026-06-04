import java.util.*;
public class SwitchOperator {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    switch(number){
        case 1:
        System.out.println("Samosa");
        case 2:
        System.out.println("Mango");
        case 3:
        System.out.println("Banana shake");
        default :
        System.out.println("wake up");
    }
    sc.close();
    }
    
}
//pura run hoga aur pura number aayega because break statement nhi use hua hai
