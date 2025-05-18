////////////////////////////////////////////////////////////////
//
//  File Name   : program2.c
//  Description : Accepts value in dollar and returns it in inr
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : DollartoINR
//  Description   : Returns Dollar to INR conversion for input Integer value
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int DollarToINR(int iNo)
{
    int Amount = 0;
    Amount = iNo * 70;
    return Amount;
}
int main()
{
    int iValue = 0, iRet = 0;
    
    printf("Enter number of USD");
    scanf("%d",&iValue);
    
    iRet = DollarToINR(iValue);
    
    printf("Value in INR is %d",iRet);
    
    return 0;
}