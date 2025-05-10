////////////////////////////////////////////////////////////////
//
//  File Name   : program3.c
//  Description : Accepts a Integer and Prints it's Even Factorials
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : DisplayEvenFactor
//  Description   : Prints Even Factorials of Input Integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void DisplayEvenFactor(int iNo)
{
    int iCnt = 0;

    if(iNo <= 0)
    {
        iNo = -iNo;
    }
    else 
    {
        for(iCnt = 2; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt == 0) && (iCnt % 2 == 0)) //If we want both divisible by 2 & 3 just add (iCnt % 3 == 0);
            {
               printf("%d\t",iCnt);
            }    
        }
    }
}
int main()
{
    int iValue = 0;

    printf("Enter Number\n");
    scanf("%d",&iValue);

    DisplayEvenFactor(iValue);
    return 0;
}