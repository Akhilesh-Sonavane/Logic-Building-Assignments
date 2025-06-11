////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a character character array coverting it into string and returns Count of WhiteSpaces of that String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : CountWhite
//  Description   : Inputs character array coverting it into string and and returns Count of WhiteSpaces of that String
//  Input         : String
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int CountWhite(char[] chVal, int iSize)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(chVal[iCnt] == ' ')
            {
                iCount++;
            }
        }
        return iCount;
    }
}

public class program5
{
    public static void main(String args[])
    {
        int iCnt = 0;
        char[] cValue = null;
        String sValue = null;
        int iLength = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        sValue = sobj.nextLine();

        iLength = sValue.length();

        cValue = new char[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            cValue[iCnt] = sValue.charAt(iCnt);
        }

        Display dobj = new Display();

        iRet = dobj.CountWhite(cValue, iLength);

        System.out.println("White Spaces in Entered String are : "+iRet);

        sobj.close();
    }
}
