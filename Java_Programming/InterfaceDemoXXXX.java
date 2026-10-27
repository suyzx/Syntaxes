interface A
{
    void fun();
}
interface B
{
    void gun();
}
class C implements A,B
{
    public void gun()
    {
        System.out.println("Inside The GUN");
    }
    public void fun()
    {
        System.out.println("inside the FUN");
    }
}
class InterfaceDemoXXXX
{
    public static void main(String A[])
    {
        C obj=new C();
        obj.fun();
        obj.gun();
    }
}