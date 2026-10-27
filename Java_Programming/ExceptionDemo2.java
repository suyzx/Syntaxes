import java.util.*;
class ExceptionDemo2
{
    public static void main(String A []) 
    {
     Scanner sobj=new Scanner(System.in);

     int Arr[]={11,21,51,101,111};
     int index=0;

     System.out.println("enter index : ");
     index=sobj.nextInt();

     System.out.println("element is "+Arr[index]);

     System.out.println("End of main");
    }
}