////////////////////////////////////////////////////////////////
//
//  File Name   : program4.c
//  Description : Reads one character and converts it to lower and upper case
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : DisplayConvert
//  Description   : Accept input character & coverts it into upper or lower case
//  Input         : Character
//  Output        : Character
//
////////////////////////////////////////////////////////////////

void DisplayConvert(char cVal)
{
    if(cVal >= 'a' && cVal <= 'z')
    {
        printf("%c\n",cVal - 32);
    }
        
    else if(cVal >= 'A' && cVal <= 'Z')
    {
        printf("%c\n",cVal + 32);
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter Character\n");
    scanf("%c",&cValue);

    DisplayConvert(cValue);
    return 0;
}