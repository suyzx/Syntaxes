#include <iostream>
using namespace std;

class Base
{
    public:
        int i,j;

        Base()
        {
            cout<<"Inside Base constructor\n";
        }

        ~ Base()
        {
            cout<<"Inside Base destructor\n";
        }

        void fun()
        {
            cout<<"inside Base fun\n";
        }

        void gun()
        {
            cout<<"Inside Base gun\n";
        }

};

class Derived :public Base
{
    public :
        int x,y;

        Derived()
        {
            cout<<"inside Derived constructor\n";

        }

        ~Derived()
        {
            cout<<"inside Derived Destructor\n";

        }

        void sun()
        {
            cout<<"inside Derived Sun\n";
        }
};

class derivedX:public Derived
{
    public :
        int a;

        derivedX()
        {
            cout<<"Insise DerivedX constructor \n";
        }

       ~ derivedX()
        {
            cout<<"Insise DerivedX destructor \n";
        }

        void run()
        {
            cout<<"Inside Derivedx run\n";
        }

};

int main ()
{


derivedX dobj;
dobj.fun();
dobj.gun();
dobj.sun();
dobj.run();

    return 0;
}