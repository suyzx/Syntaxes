class PPA
{ 
     public PPA()
    {
        System.out.println("Inside Java Constructor");

    }
}

class Demo extends PPA
{
    public int i,j;
     public Demo()
    {
        System.out.println("Inside Demo Constructor");

    }
}

class Hello extends PPA
{
     public Hello()
    {
        System.out.println("Inside hello Constructor");

    }
}



class Hierarchal
{
    public static void main (String A[])
    {
        PPA pobj =new PPA();
        Hello hobj =new Hello();

    }
}