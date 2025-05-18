////////////////////////////////////////////////////////////////
//
//  File Name   : program2.c
//  Description : Accept a Integer and returns word for that Integer
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 17/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Display
//  Description   : Returns word for input Integer
//  Input         : Integer
//  Output        : String
//
////////////////////////////////////////////////////////////////

void Display(int iNo)
{
    if (iNo < 0 || iNo > 9) 
    {
        printf("Invalid input! Please enter a digit between 0 and 9.\n");
    } 
    else 
    {
        switch(iNo) 
        {
            case 0: printf("Zero\n"); break;
            case 1: printf("One\n"); break;
            case 2: printf("Two\n"); break;
            case 3: printf("Three\n"); break;
            case 4: printf("Four\n"); break;
            case 5: printf("Five\n"); break;
            case 6: printf("Six\n"); break;
            case 7: printf("Seven\n"); break;
            case 8: printf("Eight\n"); break;
            case 9: printf("Nine\n"); break;
        }
    }        
}
int main() 
{
    int iDigit = 0;

    printf("Enter a single digit (0-9): ");
    scanf("%d", &iDigit);

    Display(iDigit);

    return 0;
}