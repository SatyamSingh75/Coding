import java.util.*;
public class Pensproblem {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int pen = sc.nextInt();
        int pencil = sc.nextInt();
        int eraser = sc.nextInt();
        int Total = (pen+pencil+eraser);
        System.out.println("Total is:" + Total);
        // 18%GST
        float newtotal = (float)Total * 0.18f;
        System.out.println("Total with GST is:" + newtotal);
        sc.close();
    }
}
