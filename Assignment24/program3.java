////////////////////////////////////////////////////////////////
//
//  File Name   : program3.java
//  Description : Accept a character character array coverting it into string and returns difference number of small & capital characters
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Difference
//  Description   : Inputs character array coverting it into string and returns difference of small & capital characters
//  Input         : String
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int Difference(char[] chVal, int iSize)
    {
        int iCnt = 0;
        int iCapitalCount = 0;
        int iSmallCount = 0;
        int iDiff = 0;

        while(iCnt < iSize)
        {
            if((chVal[iCnt] >= 'A') && (chVal[iCnt] <= 'Z'))
            {
                iCapitalCount++;
            }
            else if((chVal[iCnt] >= 'a') && (chVal[iCnt] <= 'z'))
            {
                iSmallCount++;
            }
            else 
            {
                System.out.println("Invalid Input");
            }
            iCnt++;
        }

        iDiff = iCapitalCount - iSmallCount;

        if(iDiff < 0)
        {
            iDiff = -iDiff;
        }

        return iDiff;
    }
}

public class program3
{
    public static void main(String args[])
    {
        int iCnt = 0;
        char[] cValue = null;
        String sInput = null;
        int iLength = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        sInput = sobj.nextLine();

        iLength = sInput.length();

        cValue = new char[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            cValue[iCnt] = sInput.charAt(iCnt);
        }

        Display dobj = new Display();

        iRet = dobj.Difference(cValue,iLength);

        System.out.println("Difference of Capital and Small character is : "+iRet);

        sobj.close();
    }
}