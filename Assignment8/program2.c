////////////////////////////////////////////////////////////////
//
//  File Name   : program2.c
//  Description : Accept a Integer and returns Area of Rectangle
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : RectArea
//  Description   : Returns Area of Rectangle for input float
//  Input         : Float
//  Output        : Double
//
////////////////////////////////////////////////////////////////

double RectArea(float fWidth,float fHeight)
{
     double Area = fWidth*fHeight;
     return Area;
}

int main()
{
    float fValue1 = 0.0, fValue2 = 0.0;
    double dRet = 0.0;
    
    printf("Enter Width");
    scanf("%f",&fValue1);
    
    printf("Enter height");
    scanf("%f",&fValue2);
    
    dRet=RectArea(fValue1,fValue2);
    
    printf("Area of rectangle : %lf",dRet);
    
    return  0;
}