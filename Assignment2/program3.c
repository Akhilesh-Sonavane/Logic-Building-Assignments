////////////////////////////////////////////////////////////////
//
//  File Name   : program3.c
//  Description : Accepts a Number, checks it if it's less then 10 prints "Hello" else prints "Demo" on Consol
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Display
//  Description   : Checks the inputed Integer is less than 10 and then prints "Hello" else prints "Demo" 
//  Input         : Integer
//  Output        : String
//
////////////////////////////////////////////////////////////////

void Display(int iNo)
{
    if(iNo < 10)
    {
        printf("Hello\n");
    }
    else 
    {
        printf("Demo\n");
    }
}

int main()
{
    int iValue = 0;
    printf("Enter Number\n");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;
}