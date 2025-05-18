////////////////////////////////////////////////////////////////
//
//  File Name   : program3.c
//  Description : Accept a Integer and returns conversion from Km to meter
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : KMtoMeter
//  Description   : Returns conversion of KM to Meter for input integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int KMtoMeter(int iNo)
{
     int Meter = iNo * 1000;
     return Meter;
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter distance");
    scanf("%d",&iValue);
    
    iRet=KMtoMeter(iValue);
    
    printf(" Meter : %d",iRet);
    
    return  0;
}