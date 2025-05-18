////////////////////////////////////////////////////////////////
//
//  File Name   : program5.c
//  Description : Accepts value integer and returns its differnce of odd even fatorials
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : FactorialDiff
//  Description   : Returns Differnce of odd even factorials for input Integer value
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int FactorialDiff(int iNo)
{
    int iEventFact = 1;
    int iOddFact = 1;
    int result = 0;
    int iCnt = 0;
   
    if(iNo<0)
   {
    iNo = -iNo;
   }
   
   for (iCnt = 1; iCnt <= iNo; iCnt++)
   {
    if((iCnt % 2) == 0)
    {
       iEventFact = iEventFact * iCnt;
    }
    else
    {
        iOddFact = iOddFact * iCnt;
    }       
   }
   result = iEventFact - iOddFact;
   
   return result;
}

int main()
{
    int iValue = 0,iRet = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);
    
    printf("Odd Factorial of number is : %d",iRet);

    return 0;
}

//Time Complexity O(N)