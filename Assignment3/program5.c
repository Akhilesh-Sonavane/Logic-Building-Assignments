////////////////////////////////////////////////////////////////
//
//  File Name   : program5.c
//  Description : Accepts a character and checks it its vowel or not
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

////////////////////////////////////////////////////////////////
// 
//  Function Name : CheckVowel
//  Description   : Checks the input character is a Vowel or not
//  Input         : Character
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

BOOL CheckVowel(char cVal)
{
    if(cVal == 'a' || cVal == 'e' || cVal == 'i' || cVal == 'o' || cVal == 'u' ||
        cVal == 'A' || cVal == 'E' || cVal == 'I' || cVal == 'O' || cVal == 'U')
        {
            return TRUE;
        }
        else
        {
            return FALSE;
        }
}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter Character\n");
    scanf("%c",&cValue);
    
    bRet = CheckVowel(cValue);

    if(bRet == 0)
    {
        printf("The Entered character %c is Not a Vowel(FALSE)\n",cValue);
    }
    else
    {
        printf("The Entered character %c is a Vowel(TRUE)\n",cValue);
    }
    
    return 0;
}