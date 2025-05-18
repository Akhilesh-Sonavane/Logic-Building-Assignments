////////////////////////////////////////////////////////////////
//
//  File Name   : program1.c
//  Description : Accepts a Number and outputs multiplication of its factors
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : MultiFact
//  Description   : Returns the multiplication of factor of inputed integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int MultiFact(int iNo)
{
    int iCnt = 0;
    int iMulti = 0;
    iMulti = 1;
    
    for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iMulti = iMulti * iCnt;
        }
    }
    return iMulti;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number to get its Factor Multiplication :\n");
    scanf("%d",&iValue);

    iRet = MultiFact(iValue);

    printf("Mutliplication of %d is : %d",iValue, iRet);

    return 0;
}
