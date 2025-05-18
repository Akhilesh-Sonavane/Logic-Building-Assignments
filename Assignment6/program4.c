////////////////////////////////////////////////////////////////
//
//  File Name   : program4.c
//  Description : Accept a Integer and returns it Multiplication Table
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Table
//  Description   : Returns Multiplication Table of input Integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void Table(int iNo)
{
    int iNum = 1;
   
    if(iNo < 0)
   {
    iNo = -iNo;
   }
   
   for (int iCnt = 1; iCnt <= 10; iCnt++)
   {
       iNum=iNo * iCnt;
       printf("%d\n",iNum);
   }

}

int main()
{
    int iValue = 0;
    
    printf("Enter number");
    scanf("%d",&iValue);
    
    Table(iValue);

    return 0;
}