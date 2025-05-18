////////////////////////////////////////////////////////////////
//
//  File Name   : program5.c
//  Description : Accept N number and Returns its Multiples
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : MultipleDisplay
//  Description   : Returns Multiples of inputed Integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void MultipleDisplay(int iNo)
{
    int iCnt = 0;
    int iMulti = 0;
    iMulti = 1;

    for (iCnt = 1; iCnt <= 5; iCnt++)
    {
        printf("%d\t",(iNo * iCnt));
    }
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number :\n");
    scanf("%d",&iValue);

    MultipleDisplay(iValue);
    
    return 0;
}