////////////////////////////////////////////////////////////////
//
//  File Name   : program1.c
//  Description : Accepts Integer and returns the pattern
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Pattern
//  Description   : Take a Number and Returns a Pattern 
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void Pattern(int iNo)
{
    int iCnt = 0;

    for (iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("$   *\t",iCnt);
    }
    
}

int main()
{
    int iValue = 0;

    printf("Enter Number :\n");
    scanf("%d",&iValue);

    Pattern(iValue);

    return 0;
}
