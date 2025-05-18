////////////////////////////////////////////////////////////////
//
//  File Name   : program3.c
//  Description : Accept a Integer and counts 2 in it
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : CountTwo
//  Description   : Returns count of 2 for input integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int CountTwo(int iNo)
{
    int iDigit = 0;
    int iFreq = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    while (iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 2)
        {
            iFreq  = iFreq + 1;
        }
        iNo = iNo / 10;
    }

    return iFreq ;
}

int main()
{
    int iValue =0;
    int iRet = 0;
 
    printf("enter number");
    scanf("%d",&iValue);

    iRet= CountTwo(iValue);
 
    printf("%d",iRet);
 
    return 0;
}