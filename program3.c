////////////////////////////////////////////////////////////////
//
//  File Name   : program3.c
//  Description : Accepts a Integer and return its reverse non factors
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : NonFactRev
//  Description   : Returns a reverse of non factors of given number
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void NonFactRev(int iNo)
{
    int iCnt = 0;

    for (iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if((iNo % iCnt) != 0)
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

    NonFactRev(iValue);

    return 0;
}