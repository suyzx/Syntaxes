interface A
{
    void fun();
}
interface B
{
    void fun(int x);
}
class C implements A,B
{
    public void fun()
    {
        System.out.println("Inside the FUN");
    }
    public void fun(int X)
    {
        System.out.println("Inside the Fun X");
        int j=X;
        System.out.println(j);
    }
}
class InterfaceDemoXXXXX
{
    public static void main(String A[])
    {
        C c=new C();
        c.fun();
        c.fun(11);
    }
}

// interface A
// {
//     void fun();
// }
// interface B extends A
// {
//     void fun(int x);
// }
// class C implements B
// {
//     public void fun()
//     {
//         System.out.println("Inside the FUN");
//     }
//     public void fun(int X)
//     {
//         System.out.println("Inside the Fun X");
//         int j=X;
//         System.out.println(j);
//     }
// }
// class InterfaceDemoXXXXX
// {
//     public static void main(String A[])
//     {
//         C c=new C();
//         c.fun();
//         c.fun(11);
//     }
// }