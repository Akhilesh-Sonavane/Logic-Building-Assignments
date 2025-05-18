////////////////////////////////////////////////////////////////
//
//  File Name   : program3.c
//  Description : Accept a Integer and counts digits in between 3 to 7
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : CountRange
//  Description   : Returns count of digit in between 3 to 7 of input integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int CountRange(int iNo)
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
       
        if((iDigit > 3) && (iDigit < 7))
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

    iRet= CountRange(iValue);
 
    printf("%d",iRet);
 
    return 0;
}