////////////////////////////////////////////////////////////////
//
//  File Name   : program1.c
//  Description : Accepts a Number a prints the Even Numbers of that Number Total
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : PrintEven
//  Description   : Takes Input Integer and Prints Even numbers total of that Number
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void PrintEven(int iNo)
{
    int iEvn = 0;
    
    int iCnt = 0;
    
    if(iNo <= 0)
    {
        printf("INVALID INPUT\n");
        return;
    }
    else 
    {
        iEvn = 2;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            printf("%d\t",iEvn);
            iEvn += 2;
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter Number\n");
    scanf("%d",&iValue);
    
    PrintEven(iValue);    

    return 0;
}