import java.util.*;
public class HollowRectanglePattern{
  public static void HellowRectangle(int Row,int Col){
    for(int i=1;i<=Row;i++){
      for(int j=1;j<=Col;j++){
        if(i==1||j==1||i==Row||j==Col){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }
    public static void main(String args[]){
      HellowRectangle(4,5 );
    }
  }
  