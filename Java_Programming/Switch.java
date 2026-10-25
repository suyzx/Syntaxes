import java.util.Scanner;
class Switch 
{
    public static void main(String A[])
    {

        Scanner sobj=new Scanner(System.in);
        int i;
        System.out.println("enter a number");
        i= sobj.nextInt();

        switch(i) {

            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("sunday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("Holiday"); 
            

        }

    }

}