////////////////////////////////////////////////////////////////
//
//  File Name   : program4.java
//  Description : Accept a String and a Integer and returns Small Characters of String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : StrCpySmall
//  Description   : Inputs String and a Integer and returns Small Characters of String
//  Input         : String
//  Output        : String
//
////////////////////////////////////////////////////////////////

class Display
{
    public void StrCpySmall(char[] chVal1, char[] chVal2, int iSize)
    {
        int iCnt1 = 0;
        int iCnt2 = 0;

        if((chVal1 == null))
        {
            System.out.println("Invalid Input");
            return;
        }

        while(iCnt1 < iSize) 
        {
            if((chVal1[iCnt1] >= 'a') && (chVal1[iCnt1] <= 'z'))
            {
                chVal2[iCnt2] = chVal1[iCnt1];
                iCnt2++;
            }
            iCnt1++;
        }

        System.out.println("LowerCase Characters from String are : ");

        for(iCnt2 = 0; iCnt2 < iSize; iCnt2++)
        {
            System.out.print(chVal2[iCnt2]);
        }
    }
}

public class program4
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

        dobj.StrCpySmall(chArr1,chArr2,iLength);

        sobj.close();
    }
}