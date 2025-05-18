////////////////////////////////////////////////////////////////
//
//  File Name   : program1.c
//  Description : Accept a Integer and returns its digits in reverse
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : DisplayDigit
//  Description   : Returns reverse of digit sequence for input integer
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void DisplayDigit(int iNo)
{
    int iDigit = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while (iNo != 0)
    {   
        iDigit = iNo % 10;
        printf("%d \n",iDigit);
        iNo = iNo / 10;
        
    }
    
}

int main()
{
    int iValue = 0;
    
    printf("Enter number");
    scanf("%d",&iValue);
    
    DisplayDigit(iValue);
    
    return 0;
}
