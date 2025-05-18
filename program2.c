////////////////////////////////////////////////////////////////
//
//  File Name   : program2.c
//  Description : Accepts a Integer and return its reverse factors
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : FactRev
//  Description   : Returns a reverse of factors of given number
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void FactRev(int iNo)
{
    int iCnt = 0;

    for (iCnt = (iNo/2); iCnt >= 0; iCnt--)
    {
        if((iNo % iCnt) == 0)
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

    FactRev(iValue);

    return 0;
}