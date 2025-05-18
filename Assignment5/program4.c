////////////////////////////////////////////////////////////////
//
//  File Name   : program4.c
//  Description : Accept N number and Returns its Odd
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : OddDisplay
//  Description   : Returns Odd Integer of inputed Integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void OddDisplay(int iNo)
{
    int iCnt = 0;

    for (iCnt = 1; iCnt < iNo; iCnt++)
    {
        if((iCnt % 2) != 0)
        {
            printf("%d\t",iCnt);
        }
    }
}
int main()
{
    int iValue = 0;

    printf("Enter Number :\n");
    scanf("%d",&iValue);

    OddDisplay(iValue);

    return 0;
}