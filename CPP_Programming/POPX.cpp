#include<iostream>
using namespace std;

int addittion(int no1, int no2)
{
    int ans=0;
    ans = no1 + no2;
    return ans;
}

int main()
{
    int value1=0, value2=0, result=0;
    
    cout<<"Enter first number :  \n";
    cin>>value1;

    cout<<"Enter Second number :  \n";
    cin>>value2;

    result = addittion(value1,value2);

    cout<<"Addittion is : "<<result<<"\n";

    return 0;
}