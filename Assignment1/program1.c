////////////////////////////////////////////////////////////////
//
//  File Name   : program1.c
//  Description : Divide Two Integer Numbers
//  Author      : Akhilesh.P.Sonavane
//  Date        : 10/05/2025
//
////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////
// 
//  Function Name : Divide
//  Description   : Used to Divide Two Integer Numbers
//  Input         : Integer, Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

int Divide(int ino1, int ino2)
{
    int iAns = 0;

    if(ino2 == 0)
    {
        return -1;
    }
    
    else
    {
        iAns = ino1 / ino2;
    }
    
    return iAns;
}

int main()
{
    int iValue1 = 15, iValue2 = 5;
    int iRet = 0;

    iRet = Divide(iValue1, iValue2);

    printf("Division is : %d\n",iRet);

    return 0;
}