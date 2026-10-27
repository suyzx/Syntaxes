interface Calculations
{
    int addition(int x,int y);
    int substraction(int x,int y);

}
class Mathematics implements Calculations
{
    public int addition(int x,int y)
    {
        return x+y;
    }
    public int substraction(int x,int y)
    {
        return x-y;
    }
    public int multiplication(int x,int y)
    {
        return x*y;
    }
}
class InterfaceDemo
{
    public static void main(String A[])
    {
        Mathematics mobj=new Mathematics();
        System.out.println("addition is : "+mobj.addition(11, 11));
        System.out.println("Substraction is :"+mobj.substraction(12,11));
        System.out.println("Multiplication is : "+mobj.multiplication(11, 2));
    }
}