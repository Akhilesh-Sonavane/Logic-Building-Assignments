////////////////////////////////////////////////////////////////
//
//  File Name   : program5.c
//  Description : Checks the entered Number is Even or Odd
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

////////////////////////////////////////////////////////////////
// 
//  Function Name : ChkEven
//  Description   : Checks the input Integer is Even or Odd 
//  Input         : Integer
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

BOOL ChkEven(int iNo)
{
    if((iNo % 2) == 0)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter Number\n");
    scanf("%d",&iValue);

    bRet = ChkEven(iValue);
    
    if(bRet == 1)
    {
        printf("The Entered Integer %d is Even Number\n",iValue);
    }
    else 
    {
        printf("The Entered Integer %d is Odd Number\n",iValue);
    }
    
    return 0;
}