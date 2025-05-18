////////////////////////////////////////////////////////////////
//
//  File Name   : program5.c
//  Description : Accept a Integer and counts frequency of digits less than 6
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Count
//  Description   : Returns count frequency of digits less than 6 for input integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int Count(int iNo)
{
    int iDigit = 0;
    int iFreq = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    while (iNo != 0)
    {
        iDigit=iNo%10;
        
        if(iDigit < 6)
        {
            iFreq  = iFreq + 1;
        }
        iNo = iNo / 10;
    }

    return iFreq ;
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("enter number");
    scanf("%d",&iValue);

    iRet= Count(iValue);
    
    printf("%d",iRet);
    
    return 0;
}