import java.util.*;
class ExceptionDemo1
{
    public static void main(String A []) 
    {
     Scanner sobj=new Scanner(System.in);

     int No1=0, No2=0, Ans=0;
     System.out.println("enter first Number : ");
     No1=sobj.nextInt();

    System.out.println("enter Second Number : ");
     No2=sobj.nextInt();

     Ans=No1/No2;     //exception prone code

     System.out.println("Division is "+Ans);
    }
}