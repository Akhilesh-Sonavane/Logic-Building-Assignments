////////////////////////////////////////////////////////////////
//
//  File Name   : program4.c
//  Description : Accept a Float and returns conversion from Farhrenheit to Celsius
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : FHtoCs
//  Description   : Returns conversion of Temperation Farhrenheit to Celsius for input float
//  Input         : Float
//  Output        : Double
//
////////////////////////////////////////////////////////////////
double FhtoCs(float fTemp)
{
     double celsius = ((fTemp - 32) * (5.0f / 9.0f));
     return celsius;
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;
    
    printf("Enter temperature in Fahrenheit :");
    scanf("%f",&fValue);
  
    dRet=FhtoCs(fValue);
    
    printf("temperature in celsius : %lf",dRet);
    
    return 0;
}