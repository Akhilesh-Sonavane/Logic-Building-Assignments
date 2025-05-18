////////////////////////////////////////////////////////////////
//
//  File Name   : program1.c
//  Description : Accept a Integer and returns Area of Circle
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : CircleArea
//  Description   : Returns Area of Circle for input float
//  Input         : Float
//  Output        : Double
//
////////////////////////////////////////////////////////////////

double CircleArea(float fRadius)
{
     double Area = 3.14 * fRadius * fRadius;
     return Area;
}
int main()
{
    float fValue = 0.0;
    double dRet = 0.0;
    
    printf("Enter radius");
    scanf("%f",&fValue);
    
    dRet = CircleArea(fValue);
    
    printf("Area of circle : %lf",dRet);
    
    return  0;
}
