////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a Character and Convert it into Decimal, Octal, HexaDecimal
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Conversion
//  Description   : Inputs Character and Convert it into Decimal, Octal, HexaDecimal
//  Input         : Character
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public void Conversion(char[] chVal, int iSize)
{
    for (int iCnt = 0; iCnt < iSize; iCnt++)
    {
        int iAscii = (int) chVal[iCnt];
        System.out.println("For Character " + chVal[iCnt] + " Decimal Value is : " + iAscii);

        int iTemp = iAscii;
        String sOctal = "";
        while (iTemp != 0)
        {
            int iOctRem = iTemp % 8;
            sOctal = iOctRem + sOctal; 
            iTemp = iTemp / 8;
        }
        if (sOctal.equals("")) sOctal = "0";
        System.out.println("Octal Value is : " + sOctal);

        iTemp = iAscii;
        String sHexDec = "";
        while (iTemp != 0)
        {
            int iHexRem = iTemp % 16;
            char cHexDigit;
            if (iHexRem < 10)
            {
                cHexDigit = (char) (iHexRem + '0');
            }
            else
            {
                cHexDigit = (char) (iHexRem - 10 + 'A');
            }
            sHexDec = cHexDigit + sHexDec; 
            iTemp = iTemp / 16;
        }
        if (sHexDec.equals("")) sHexDec = "0";
        System.out.println("HexaDecimal Value is : " + sHexDec);
    }
}
}
public class program5
{
    public static void main(String args[])
    {
        int iCnt = 0;
        char[] cValue = null;
        String sInput = null;
        int iLength = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character : ");
        sInput = sobj.nextLine();

        iLength = sInput.length();

        cValue = new char[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            cValue[iCnt] = sInput.charAt(iCnt);
        }

        Display dobj = new Display();

        dobj.Conversion(cValue,iLength);

        sobj.close();
    }
}