////////////////////////////////////////////////////////////////
//
//  File Name   : program2.c
//  Description : Accept a Integer and checks whether it contains 0 or not
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : ChkZero
//  Description   : Check whether input integer contains 0 or not
//  Input         : Integer
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL ChkZero(int iNo)
{
    int iDigit = 0;
    
    if(iNo < 0)
    {
        iNo=-iNo;
    }

    while (iNo != 0)
    {
        iDigit = iNo % 10;
        
        if(iDigit == 0)
        {
            return TRUE;
        }
        iNo = iNo / 10;
    }
    return FALSE;
}
int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;
    
    printf("enter number");
    scanf("%d",&iValue);

    bRet= ChkZero(iValue);
    
    if(bRet == TRUE)
    {
        printf("it contains zero");
    }
    
    else
    {
        printf("There is no zero");
    }
  
    return 0;
}