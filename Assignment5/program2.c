////////////////////////////////////////////////////////////////
//
//  File Name   : program2.c
//  Description : Accepts Integer and displays all number before it
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Display
//  Description   : Take a Number and Returns all number before it 
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void Display(int iNo)
{
    int iCnt = 0;

    for (iCnt = 1; iCnt <= iNo; iCnt++)
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