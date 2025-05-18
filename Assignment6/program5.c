////////////////////////////////////////////////////////////////
//
//  File Name   : program5.c
//  Description : Accept a Integer and returns it Reverse Multiplication Table
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : TableRev
//  Description   : Returns Reverse Multiplication Table of input Integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void TableRev(int iNo)
{
    int iNum = 1;
    int iCnt = 0;
    
    if(iNo < 0)
    {
     iNo = -iNo;
    }
   
   for (iCnt = 10; iCnt >= 1; iCnt--)
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
    
    TableRev(iValue);

    return 0;
}