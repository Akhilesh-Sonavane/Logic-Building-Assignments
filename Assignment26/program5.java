////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a String and a Character and returns Reversed String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : StrRevX
//  Description   : Inputs String and a Charater and returns Reversed String
//  Input         : String
//  Output        : String
//
////////////////////////////////////////////////////////////////

class Display
{
    public void StrRevX(char[] chVal, int iSize)
    {
        int iCnt = 0;

        System.out.println("Reversed String : ");

        for(iCnt = (iSize-1); iCnt >= 0; iCnt--)
        {
            System.out.print(chVal[iCnt]);    
        }   
    }
}

public class program5
{
    public static void main(String args[])
    {
        int iCnt = 0;
        int iLength = 0;
        char[] cValue = null;
        String sValue = null;

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

        dobj.StrRevX(cValue, iLength);
        
        sobj.close();
    }
}