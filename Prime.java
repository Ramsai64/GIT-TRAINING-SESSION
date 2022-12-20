import java.io.*;
import java.util.*;
class Prime
{
   public static void main(String args[])
    {
      int p,i=2,c=0;
      System.out.println("enter the number:");
      Scanner r=new Scanner(System.in);
      p=r.nextInt();
      for(i=2;i<p/2;i++)
      {
         if(p%i==0)
           {
              c=c+1;
           }
      }
      if(c==0)
      {
         System.out.println("given number is prime");
      }
      else
      {
         System.out.println("given number is not a prime");
      }
  }
}