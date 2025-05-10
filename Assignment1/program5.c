////////////////////////////////////////////////////////////////
//
//  File Name   : program5.c
//  Description : Prints '*' Pattern on Screen from no of given Integer 
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Accept
//  Description   : Takes N Number and prints '*' total of that Integer
//  Input         : Integer
//  Output        : Character
//
////////////////////////////////////////////////////////////////

void Accept(int iNo)
{
    int iCnt = 0;
    for(iCnt = 1; iCnt <= 5; iCnt++)
    {
        printf("*\n");
    } 
}
int main()
{   
    int iValue = 0;
    iValue = 5;

    Accept(iValue);

    return 0;
}