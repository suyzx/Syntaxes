#include<iostream>
using namespace std;

class arithmatic
{
    public:
        int no1;
        int no2;

        arithmatic()
        {
            this->no1=0;
            this->no2=0;
        }

        arithmatic(int i, int j)
        {
            this->no1=i;
            this->no2=j;
        }

        //int addittion(arithmatic *this)
        int addittion ()
        {
            int ans=0;
            ans = this->no1 + this->no2;
            return ans;

        }

};

int main()
{
   arithmatic aobj1(10,11);

   int result = 0;

   //result = addittion(&aobj1);
   result = aobj1.addittion();
   
   cout<<"Addittion is : "<<result<<"\n";





    return 0;
}