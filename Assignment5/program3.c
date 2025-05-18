////////////////////////////////////////////////////////////////
//
//  File Name   : program3.c
//  Description : Accepts Integer and displays all number before with '+' and '-' values
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Display
//  Description   : Take a Number and Returns all number '+' and '-'
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void Display(int iNo)
{
    int iCnt = 0;

    for (iCnt = -iNo; iCnt <= iNo; iCnt++)
    {
        printf("%d\t",iCnt);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter Number :\n");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;
}