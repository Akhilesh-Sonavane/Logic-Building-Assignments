////////////////////////////////////////////////////////////////
//
//  File Name   : program1.c
//  Description : Accepts one number and prints that total number of '*' on screen 
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Display
//  Description   : Takes a Number and prints '*' total of that Integer
//  Input         : Integer
//  Output        : String or Character
//
////////////////////////////////////////////////////////////////

void Display(int iNo)
{
    int iCnt = 0;

    if(iNo <= 0)
    {
        printf("Invalid Input\n");
    }
    else
    {
    while (iCnt < iNo)
    {
        printf("*\n");
        iCnt++;
    }
}
}
int main()
{
    int iValue = 0;

    printf("Enter a Number\n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}