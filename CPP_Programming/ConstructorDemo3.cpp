#include<iostream>
using namespace std;

class PPA
{
    public:
        int no1;
        int no2;


// Default constructor 
    PPA()
    {
        cout<<"Inside Default constructor\n";
    }
    
// parametarised constructor
    PPA(int a, int b)
    {
        cout<<"Inside parametarised constructor\n";
    }

// Copy Constructor
    PPA(PPA &obj)
    {
        cout<<"Inside Copy Constructor\n";

    }

    ~PPA()
    {
        cout<<"Inside destructor \n";
    }
       
};


int main()
{
    PPA pobj1;                    //default
    PPA pobj2(11,21);             //parametarised

    PPA pobj3(pobj1);             //copy


    return 0;
}