////////////////////////////////////////////////////////////////
//
//  File Name   : program4.c
//  Description : Prints the accepted Number and Displays that in entered Frequency 
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Display
//  Description   : Prints the Accepted integer and displays it in entered frequnecy
//  Input         : Integer, Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

void Display(int iNo, int iFrequency)
{
    int iCnt = 0;

    if((iNo <= 0) && (iFrequency <= 0))
    {
        printf("Invalid Input\n");
    }
    else
    {
    for(iCnt = 1; iCnt <= iFrequency; iCnt++)
    {
        printf("%d\t",iNo);
    }
}
}
int main()
{
    int iValue = 0;
    int iCount = 0;

    printf("Enter Number\n");
    scanf("%d",&iValue);

    printf("Enter Frequency\n");
    scanf("%d",&iCount);

    Display(iValue, iCount);
    return 0;
}