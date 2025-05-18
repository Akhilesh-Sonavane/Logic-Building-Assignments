////////////////////////////////////////////////////////////////
//
//  File Name   : program4.c
//  Description : Accepts value integer and returns its odd fatorials
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : EvenFactorial
//  Description   : Returns odd factorials for input Integer value
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int  OddFactorial(int iNo)
{
    int iCnt = 0;
    int iFact = 1;
   
    if(iNo < 0)
   {
    iNo = -iNo;
   }
   
   for (iCnt = 1; iCnt <= iNo; iCnt++)
   {
        if((iCnt % 2) != 0)
        {
            iFact = iFact * iCnt;
        }
   }

   return iFact;
}

int main()
{
    int iValue = 0,iRet = 0;
  
    printf("Enter number");
    scanf("%d",&iValue);

    iRet = OddFactorial(iValue);

    printf("Odd Factorial of number is : %d",iRet);

    return 0;
}

//Time Complexity O(N)