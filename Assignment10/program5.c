////////////////////////////////////////////////////////////////
//
//  File Name   : program5.c
//  Description : Accept a Integer and calculates differnce in Digits of odd and even
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : CountDiff
//  Description   : Returns difference of even and odd digit in input integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int CountDiff(int iNo)
{
    int iDigit = 0;
    int iEven = 0;
    int iodd = 0;
    int result = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while (iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit % 2 == 0)
        {
            iEven  = iEven + iDigit ;
        }
        else
        {
            iodd = iodd + iDigit;
        }
        iNo = iNo / 10;
    }


    result = iEven - iodd;

    return result ;
}

int main()
{
    int iValue =0;
    int iRet = 0;

    printf("enter number");
    scanf("%d",&iValue);
 
    iRet= CountDiff(iValue);
 
    printf("%d",iRet);
 
    return 0;
}