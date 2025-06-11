////////////////////////////////////////////////////////////////
//
//  File Name   : program4.java
//  Description : Accept a String and a Character and returns freqency index of Last occurance of that character in String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : LastChar
//  Description   : Inputs String and a Charater and returns freqency index of Last occurance of that character in String
//  Input         : String
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int FirstChar(char[] chVal, int iSize, char chSearch)
    {
        int iCnt = 0;
        int iCount = -1;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(chVal[iCnt] == chSearch)
            {
                iCount = iCnt;
            }
        }
        return iCount;
    }
}
public class program4
{
    public static void main(String args[])
    {
        int iCnt = 0;
        int iLength = 0;
        char[] cValue = null;
        String sValue = null;
        char cSearch = '\0';
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        sValue = sobj.nextLine();

        System.out.println("Enter the character you wanna Search in String : ");
        cSearch = sobj.next().charAt(0);

        iLength = sValue.length();

        cValue = new char[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            cValue[iCnt] = sValue.charAt(iCnt);
        }

        Display dobj = new Display();

        iRet = dobj.FirstChar(cValue, iLength, cSearch);

        System.out.println("Frequency Index of First Occurance of "+cSearch+" in our String is : "+iRet);
        
        sobj.close();
    }
}