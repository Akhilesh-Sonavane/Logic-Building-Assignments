////////////////////////////////////////////////////////////////
//
//  File Name   : program3.c
//  Description : Accept a Integer and returns it factorial
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Factorial
//  Description   : Returns Factorial for input Integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int Factorial(int iNo)
{
    int iFact = 1;
   
    if(iNo < 0)
   {
     iNo = -iNo;
   }
   
   for (int iCnt = 1;iCnt <= iNo; iCnt++)
   {
       iFact = iFact * iCnt;
   }

   return iFact;
}
int main()
{
    int iValue = 0, iRet = 0;
    
    printf("Enter number");
    scanf("%d",&iValue);
    
    iRet = Factorial(iValue);
    printf("Factorial of number is : %d",iRet);

    return 0;
}