import java.util.*;
class Selection2
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int age=0;
        System.out.println("enter your age");
        age=sobj.nextInt();

        if(age>=18)
        {
            System.out.println("allowed");
        }
        else
        {
            System.out.println("not allowed");
        }
    }
}
