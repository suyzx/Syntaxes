// # include <stdio.h>
// int main ()
// {
//     printf("Jay Ganesh...\n");

//     return 0;
// }

// gcc Ganesh.c -o Myexe

#include <stdio.h>


int Answer(int Value1, int Value2)
{
    int res=0;
    res= Value1+Value2;
    return res;
}
int main()
{
    int No1, No2,Ans;
    printf(" enter a no1 : \n");
    scanf("%d", &No1);

    printf("enter a number 2 :\n");
    scanf("%d",& No2);

    Ans=Answer(No1,No2);

    printf("the answer is : %d",Ans);
    return 0;
}