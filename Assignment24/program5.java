////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a character character array coverting it into string and returns Reverse of that String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Reverse
//  Description   : Inputs character array coverting it into string and and returns Reverse of that String
//  Input         : String
//  Output        : String
//
////////////////////////////////////////////////////////////////

class Display
{
    public void Reverse(char[] chVal, int iSize)
    {
        int iCnt = 0;
        
        System.out.println("Reversed String : ");
        for(iCnt = (iSize - 1); iCnt >= 0; iCnt--)
        {
            System.out.print(chVal[iCnt]);
        }
    }
}

public class program5 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        String sValue = null;
        int iLength = 0;
        int iCnt = 0;
        char[] cValue = null;
        boolean bRet = false;

        System.out.println("Enter String : ");
        sValue = sobj.nextLine();

        iLength = sValue.length();

        cValue = new char[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            cValue[iCnt] = sValue.charAt(iCnt);
        }

        Display dobj = new Display();

        dobj.Reverse(cValue,iLength);

        sobj.close();
    }
}