
abstract class Base
{
    
    public int i,j;
    public int addition(int no1, int no2)
        {
            return no1+no2;
        }
    public abstract int substraction (int no1, int no2 );
}


class Derived extends  Base
{
       public  int x;
       public  int substraction (int no1, int no2 )
        {
            return no1-no2;
        }
       public  int multiplication (int no1, int no2 )
        {
            return no1*no2;
        }


}

class AbstractDemo
{
    public static void main(String A[])
    {

    
    Derived dobj =new Derived();
    int Ret=0;

    Ret=dobj.addition(11,10);
    System.out.println("Addition is : "+Ret);

    Ret=dobj.substraction(11,10);
    System.out.println("substraction  is : "+Ret);

    Ret=dobj.multiplication(11,10);
    System.out.println("multiplication is : "+Ret);
    }
}
