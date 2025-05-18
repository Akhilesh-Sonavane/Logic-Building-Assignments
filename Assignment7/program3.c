////////////////////////////////////////////////////////////////
//
//  File Name   : program3.c
//  Description : Accepts value integer and returns its even fatorials
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : EvenFactorial
//  Description   : Returns even factorials for input Integer value
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int EvenFactorial(int iNo)
{
    int iFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }
   
   for (int iCnt =1;iCnt<=iNo;iCnt++ )
   {
        if((iCnt % 2) == 0)
        {
            iFact = iFact * iCnt;
        }
   }

   return iFact;
}

int main()
{
    int iValue = 0, iRet = 0;
    
    printf("Enter number");
    scanf("%d",&iValue);
    
    iRet = EvenFactorial(iValue);
    
    printf("Even Factorial of number is : %d",iRet);

    return 0;
}

//Time Complexity O(N)