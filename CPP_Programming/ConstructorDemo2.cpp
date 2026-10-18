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

    ~PPA()
    {
        cout<<"Inside destructor \n";
    }
       
};


int main()
{
    PPA pobj1;
    PPA pobj2(11,21);

   


    return 0;
}







