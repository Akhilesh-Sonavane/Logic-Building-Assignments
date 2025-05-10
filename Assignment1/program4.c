////////////////////////////////////////////////////////////////
//
//  File Name   : program4.c
//  Description : Accepts any integer and check whether its Divisible by 5
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
//  Function Name : Check
//  Description   : Used to check whether the integer entered is divisible by 5 or not
//  Input         : Integer
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

BOOL Check(int iNo)
{
    if((iNo % 5) == 0)
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

    printf("Enter a Number\n");
    scanf("%d",&iValue);

    bRet = Check(iValue);
    
    if(bRet == TRUE)
    {
        printf("Divisible by 5\n");
    }
    else
    {
        printf("Not Divisible by 5\n");
    }
    return 0;
}