////////////////////////////////////////////////////////////////
//
//  File Name   : program1.c
//  Description : Accept N number and Returns in according range Small, Large, Medium.
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Number
//  Description   : Returns Range of inputed Integer i.e Small, Large, Medium.
//  Input         : Integer
//  Output        : String
//
////////////////////////////////////////////////////////////////

void Number(int iNo)
{
    if (iNo<50)
    {
        printf("Small");
    }

    else if((iNo > 50) && (iNo<100))
    {
        printf("Medium");
    }

    else if  (iNo > 100)
    {
        printf("Large");
    }
}
int main()
{
    int iValue = 0;
    
    printf("Enter number");
    scanf("%d",&iValue);
    
    Number(iValue);

    return 0;
}
