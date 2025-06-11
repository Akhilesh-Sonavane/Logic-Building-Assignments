////////////////////////////////////////////////////////////////
//
//  File Name   : program4.java
//  Description : Accept a character character array coverting it into string and returns Digit of that String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Digit
//  Description   : Inputs character array coverting it into string and and returns Digit of that String
//  Input         : String
//  Output        : String
//
////////////////////////////////////////////////////////////////

class Display
{
    public void Digit(char[] chVal, int iSize)
    {
        int iCnt = 0;
        
        System.out.println("Digits in Entered String are : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((chVal[iCnt] >= '0') && (chVal[iCnt] <= '9'))
            {
                System.out.print(chVal[iCnt]);
            }
        }
    }
}


public class program4
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

        dobj.Digit(cValue, iLength);

        sobj.close();
    }
}