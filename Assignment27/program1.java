////////////////////////////////////////////////////////////////
//
//  File Name   : program1.java
//  Description : Accept a String and a Character and returns Copy of That String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : StrCpyX
//  Description   : Inputs String and a Charater and returns Copy of That String
//  Input         : String
//  Output        : String
//
////////////////////////////////////////////////////////////////

class Display
{
    public void StrCpyX(char[] chVal1, char[] chVal2, int iSize)
    {
        int iCnt = 0;

        if(chVal1 == null)
        {
            System.out.println("Invalid Input");
            return;
        }

        while(iCnt < iSize) 
        {
            chVal2[iCnt] = chVal1[iCnt];
            iCnt++;
        }

        System.out.println("Copied String : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.print(chVal2[iCnt]);
        }
    }
}

public class program1
{
    public static void main(String args[])
    {
        int iCnt = 0;
        int iLength = 0;
        char[] chArr1 = null;
        char[] chArr2 = null;
        String sValue = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        sValue = sobj.nextLine();

        iLength = sValue.length();

        chArr1 = new char[iLength];
        chArr2 = new char[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            chArr1[iCnt] = sValue.charAt(iCnt);
        }

        Display dobj = new Display();

        dobj.StrCpyX(chArr1,chArr2,iLength);

        sobj.close();
    }
}
