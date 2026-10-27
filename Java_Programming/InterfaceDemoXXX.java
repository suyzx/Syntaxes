interface A
{
    void fun();
}
interface b
{
    void fun();
}
class c implements A,b
{
    public void fun()
    {
        System.out.println("Inside The FUN");
    }
}
class InterfaceDemoXXX
{
    public static void main(String A[])
    {
        c cobj=new c();
        cobj.fun();

    }
}