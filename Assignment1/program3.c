////////////////////////////////////////////////////////////////
//
//  File Name   : program3.c
//  Description : Prints 5 to 1 numbers on Screen
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Display
//  Description   : Prints 5 to 1 Integers on Screen using Iterations
//  Input         : Void
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void Display()
{
    int i = 0;

    i = 5;

    while(i >= 1)
    {
        printf("%d",i);
        i--;
    }
}
int main()
{
    Display();
    
    return 0;
}