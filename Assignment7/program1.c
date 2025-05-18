////////////////////////////////////////////////////////////////
//
//  File Name   : program1.c
//  Description : Accept a Integer and returns Pattern '*' and '#'
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Factorial
//  Description   : Returns Patterns for input Integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void Display(int iNo)
{
    
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for( iCnt = 1 ; iCnt <= iNo ; iCnt++)
    {
        printf("  *  ");
    }

    for( iCnt = 1 ; iCnt <= iNo ; iCnt++)
    {
        printf("  #  ");
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number");
    scanf("%d",&iValue);
    
    Display(iValue);

    return 0;
}

//Time complexity O(2N)
