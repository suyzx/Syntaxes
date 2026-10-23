class Base
{
 public int i,j;
  public Base() {
      System.out.println("inside the BAse constructor");
   }

   public void fun() {
      System.out.println("Inside Derived fun");
   }

}
class Derived extends Base {
   public int x;
   public int y;

   public Derived() {
      System.out.println("inside the Derived constructor");
   }

   public void gun() {
      System.out.println("Inside Derived Gun");
   }
}

class DerivedX extends Derived {
   public int A;

   public DerivedX() {
      System.out.println("Inside derivedX constructor");
   }

   public void sun() {
      System.out.println("Inside DerivedX Sun");
   }
}


class MultiLevel
{
public static void main(String A[])
{
    DerivedX dobj =new DerivedX();
            dobj.sun();

    dobj.fun();

}
}