////////////////////////////////////////////////////////////////
//
//  File Name   : program5.c
//  Description : Accepts Integer and return the Summation differnce of its factors and Non Factors
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : FactDiff
//  Description   : Returns a difference of summation of non factors of given number
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int FactDiff(int iNo)
{
    int iCnt = 0;
    int iFact = 0;
    int iNonFact = 0;
    int iDiff = 0;

    for (iCnt = 1; iCnt < iNo; iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iFact = iFact + iCnt;
        }
        else 
        {
            iNonFact = iNonFact + iCnt;
        }
    }
    
    iDiff = iFact - iNonFact;
    return iDiff;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number :\n");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("Difference of Number %d is : %d\n",iValue, iRet);

    return 0;
}