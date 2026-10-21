#include <iostream>
using namespace std;

class BaseA
{
    public:
        int i,j;

        BaseA()
        {
            cout<<"Inside BaseA Constructor\n";
        }
        ~ BaseA()
        {
            cout<<"Inside BaseA Destructor\n";
        }

        void fun()
        {
            cout<<"Inside BaseA Fun \n";
        }

};

class BaseB
{
    public:
        int x,y;

        BaseB()
        {
            cout<<"Inside BaseB Constructor\n";
        }

        ~ BaseB()
        {
            cout<<"Inside BaseB Destructor\n";
        }

        void gun()
        {
            cout<<"Inside BaseB Fun \n";
        }
};

class Derived : public BaseA, BaseB
{
    public :
        int A;

        Derived()
        {
            cout<<"Inside Derived Constructor\n";            
        }
        ~ Derived()
        {
            cout<<"Inside Derived Constructor\n";            
        }

        void sun()
        {
            cout<<"inside Derived sun";
        }


};

int main()
{
cout<<sizeof(BaseA)<<"\n";
cout<<sizeof(BaseB)<<"\n";
cout<<sizeof(Derived)<<"\n";

    return 0;
}