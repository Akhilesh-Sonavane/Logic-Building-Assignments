////////////////////////////////////////////////////////////////
//
//  File Name   : program2.c
//  Description : Prints Marvellous String in 5 Iterations.
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Display
//  Description   : Prints the Iterated String 'Marvellous' 5 Times.
//  Input         : Void
//  Output        : String
//
////////////////////////////////////////////////////////////////

void Display()
{
    int i = 0;

    for(i = 1; i <= 5; i++)
    {
        printf("Marvellous\n");
    } 
}
int main()
{
    Display();

    return 0;
}