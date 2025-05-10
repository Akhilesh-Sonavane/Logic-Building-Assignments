////////////////////////////////////////////////////////////////
//
//  File Name   : program2.c
//  Description : Accepts a Integer and Prints it's Even Factorials
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : DisplayFactor
//  Description   : Prints Even Factorials of Input Integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void DisplayFactor(int iNo)
{
    int iCnt = 0;

    if (iNo <= 0)
    {

        iNo = -iNo;
    }
    else 
    {
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt == 0) && (iCnt % 2 == 0))
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

    DisplayFactor(iValue);

    return 0;
}