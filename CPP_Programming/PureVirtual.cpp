# include <iostream>
using namespace std;

class Base
{
    public :
        int i,j;
        int addition(int no1, int no2)
        {
            return no1+no2;
        }
        virtual int substraction (int no1, int no2 )=0;
};

class Derived :public Base
{
    public :
        int x;
};

int main()
{
    Base boj;    //error
    Derived dobj; //error
    return 0;
}
