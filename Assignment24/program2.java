////////////////////////////////////////////////////////////////
//
//  File Name   : program2.java
//  Description : Accept a character character array coverting it into string and returns number of small characters
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : CountSmall
//  Description   : Inputs character array coverting it into string and returns number of small characters
//  Input         : String
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int CountSmall(char[] chVal, int iSize)
    {
        int iCnt = 0;
        int iCount = 0;

        while(iCnt < iSize)
        {
            if((chVal[iCnt] >= 'a') && (chVal[iCnt] <= 'z'))
            {
                iCount++;
            }
            iCnt++;
        }
        return iCount;
    }
}
public class program2
{
    public static void main(String args[])
    {
        int iCnt = 0;
        char[] cValue = null;
        int iLength = 0;
        int iRet = 0;
        String sInput = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        sInput = sobj.nextLine();

        iLength = sInput.length(); // Getting Length & storing it in iLength;

        cValue = new char[iLength]; // getting character Array[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            cValue[iCnt] = sInput.charAt(iCnt); // allocating each character of string by indexing iCnt;
        }

        Display dobj = new Display();

        iRet = dobj.CountSmall(cValue,iLength);

        System.out.println("Number of Small Case Charaters are : "+iRet);

        sobj.close();
    }
}