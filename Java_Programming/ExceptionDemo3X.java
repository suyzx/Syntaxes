import java.util.*;

class Demo
{
    public static int  Division(int no1, int no2) throws ArithmeticException
    {
        return no1/no2;
    }
}

class ExceptionDemo3X
{
    public static void main(String A []) 
    {
     Scanner sobj=new Scanner(System.in);

     int No1=0, No2=0, Ans=0;


     System.out.println("enter first Number : ");
     No1=sobj.nextInt();

    System.out.println("enter Second Number : ");
     No2=sobj.nextInt();

     Ans=Demo.Division(No1, No2);    //exception prone code

     System.out.println("Division is "+Ans);
    }
}