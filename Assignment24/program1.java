////////////////////////////////////////////////////////////////
//
//  File Name   : program1.java
//  Description : Accept a character character array coverting it into string and returns number of capital characters
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : CountCapital
//  Description   : Inputs character array coverting it into string and returns number of capital characters
//  Input         : String
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int CountCapital(char[] chVal, int iSize)
    {
        int iCnt = 0;
        int iCount = 0;

        while(iCnt < iSize)
        {
            if((chVal[iCnt] >= 'A') && (chVal[iCnt] <= 'Z'))
            {
                iCount++;
            }
            iCnt++;
        }
        return iCount;
    }
}
public class program1
{
    public static void main(String[] args) 
    {
        char[] cValue = null;
        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;
        String sInput = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        sInput = sobj.nextLine();

        iLength = sInput.length(); // Getting the length of String(Automatically Assigns desired value to iLength with length() method);

        cValue = new char[iLength]; // it creates array of character 

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            cValue[iCnt] = sInput.charAt(iCnt); // this copies each character from sInput to cValue on index base of iCnt;
        }

        Display dobj = new Display();

        iRet = dobj.CountCapital(cValue,iLength);

        System.out.println("Capital Character are : "+iRet);

        sobj.close();
    }
}
