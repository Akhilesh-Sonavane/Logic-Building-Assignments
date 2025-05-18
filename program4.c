////////////////////////////////////////////////////////////////
//
//  File Name   : program4.c
//  Description : Accepts Integer and return the Summation of its non factors
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : SumNonFact
//  Description   : Returns a summation of non factors of given number
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int SumNonFact(int iNo)
{
    int iCnt = 0;
    int iSum = 0;

    for (iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if((iNo % iCnt) != 0)
        {
            iSum = iSum + iCnt;
        }
    }
    
    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number :\n");
    scanf("%d",&iValue);

    iRet = SumNonFact(iValue);

    printf("Summation of Non Factors of Number %d is : %d\n",iValue, iRet);

    return 0;
}