import java.io.*;
import java.util.*;
  public class NumEven{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 2 Number:");
     int a=sc.nextInt();
     int b=sc.nextInt();
     if((b-a)%2==0){
     System.out.println("EVEN");
     }
     else{
     System.out.println("ODD");
     }
   }
 }  
