////////////////////////////////////////////////////////////////
//
//  File Name   : program5.c
//  Description : Accept a Integer and returns conversion from square feet to square meter
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : SquareMeter
//  Description   : Returns conversion of area square feet to square Meter for input integer
//  Input         : Integer
//  Output        : Double
//
////////////////////////////////////////////////////////////////
double SquareMeter(int iValue)
{
     double Meter = iValue*0.0929;
     return Meter;
}
int main()
{
    int iValue = 0;
    double iRet = 0;
    
    printf("Enter area in square feet");
    scanf("%d",&iValue);
    
    iRet=SquareMeter(iValue);
    
    printf(" squareMeter : %lf",iRet);
    
    return  0;
}