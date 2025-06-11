////////////////////////////////////////////////////////////////
//
//  File Name   : program2.java
//  Description : Accept a character character array coverting it into string and returns UpperCase of that String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : struprx
//  Description   : Inputs character array coverting it into string and and returns UpperCase of that String
//  Input         : String
//  Output        : String
//
////////////////////////////////////////////////////////////////

class Display
{
    public void struprx(char[] chVal, int iSize)
    {
        int iCnt = 0;
        char cUpper = '\0';

        System.out.println("Upper case of Entered String is : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((chVal[iCnt] >= 'a') && (chVal[iCnt] <= 'z'))
            {
                cUpper = (char)(chVal[iCnt] - 32);
                System.out.print(cUpper);        
            }
            else
            {
                System.out.print(chVal[iCnt]);
            }
        }
    }
}

public class program2
{
    public static void main(String args[])
    {
        int iCnt = 0;
        char[] cValue = null;
        String sValue = null;
        int iLength = 0;

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

        dobj.struprx(cValue, iLength);

        sobj.close();
    }
}