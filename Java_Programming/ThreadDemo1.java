class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside Main");
        Thread t=Thread.currentThread();
        System.out.println("Current Thread Name is : "+t.getName());
        System.out.println("Current Thread ID is: "+t.getId());
        System.out.println("Thread is Alive or Not : "+t.isAlive());
        System.out.println("Thread Priority Is : "+t.getPriority());
        
    }
}