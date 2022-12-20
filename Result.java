import java.io.*;
import java.util.*;
class Result
{
  public static void main(String args[])
   {
      int r=0,n=6,r1=0;
      String a[]={"Ctrl, Shift and Alt are called keys:\n1) modifier\t2) function\t3) alphanumeric 4)adjustment\n","National Income estimates in India are prepared:\n1) PlanningCommission\t 2) Reserve Bank of India\t 3) Central statistical organisatiot\t4) Indian statistical Institute","What is the name of the Young Scientist Programme inaugurated by the Chairman of ISRO in May 2019?\n1) Young India-2019	2) Yuva-2019  3) Yuvika-2019	4) Youth-2019","Who among the following was elected to the board of the International Air Transport Association (IATA) in June 2019?\n1) Naresh Goyal	 2) Ajay Singh  3) Rahul Bhatia	4) Rahul","Select the option that is related to the third letter-cluster in the same way as the second letter-cluster is related to the first letter-cluster.BANK : WXLJ :: IDOL : ______\n1) DAKM	2) DAMK3) DAMJ	4) ADMK","Find the odd man out.41, 43, 47, 53, 61, 71, 73, 81\n1) 41	2) 613) 71	4) 81"};
      int b[]=new int[20];
      int c[]={1,3,3,2,2,4};
      String d[]={"no answer","no answer","no answer","no answer","no answer","Each of the numbers except 81 is a prime number."}; 
      Fail f=new Fail();
      Scanner s=new Scanner(System.in);
      for(int i=0;i<n;i++)//for loop used to given question.
      {
         int v=i;
         v=v+1;
         System.out.println("Question-"+v+"."+a[i]);
         b[i]=s.nextInt();
         for(int j=0;j<n;j++)
         {
            if(b[i]!=c[i])//condition to whether answer is right or no.
            {
            int p=i;
            p=p+1;
            System.out.println("Question-"+p+"."+"is wrong");
            System.out.println("answer is:"+c[i]);
            System.out.println("explantation:"+d[i]);
            r=r-1;
            break;
           }
         else
         {
           r=r+4;
           r1=r1+1;
           break;
         }
      }
      }//close of question.
       System.out.println("correct:"+r1);
       System.out.println("wrong:"+(n-r1));
       System.out.println("result:"+r+" out of "+n*4);
       if(r<=0)
       {
          System.out.println("your are failed so you have to try this question");
          r=f.fail();
          if(r<=0)
           {
              System.out.println("your are failed");
           }
           else
           {
              int t;
              t=((r*100)/(n*4));
              System.out.println("your percentage: "+t);
           }
             
       }
       else
       {
         int t;
         t=((r*100)/(n*4));
         System.out.println("your percentage: "+t);
     }
 }
}
class Fail
{
   String a[]={"What color does yellow and green make?\n1) Lime\t	2) Ocean mist\t 3) Maroon\t	4) Tangerine:\n","Two numbers are respectively 20% and 50% more than a third number. The ratio of the two numbers is:\n1) 2:5	2) 3:53) 4:5	4) 5:4"};
   int    b[]=new int[20];
   int    c[]={1,3};
   int n=2,r=0;
   Scanner s=new Scanner(System.in);
   int fail()
   {
    for(int i=0;i<n;i++)
       {
          int v=i;
          v=v+1;
          System.out.println("Question-"+v+"."+a[i]);
          b[i]=s.nextInt();
          if(b[i]!=c[i])
          {
             System.out.println("your are fail");
             r=-1;
          }
          else
          {  
             r=4;
          }
       }
     
   return r;
     }
} 
 
   
    