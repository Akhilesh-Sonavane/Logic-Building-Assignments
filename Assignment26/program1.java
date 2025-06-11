////////////////////////////////////////////////////////////////
//
//  File Name   : program1.java
//  Description : Accept a String and a Character and check whether that character is present that String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : ChkChar
//  Description   : Inputs String and a Charater and Checks whether that character is present in that String
//  Input         : String
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

class Display
{
    public boolean ChkChar(char[] chVal, int iSize, char chSearch)
    {
        int iCnt = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(chVal[iCnt] == chSearch)
            {
                return true;
            }
        }
        return false;
    }
}
public class program1
{
    public static void main(String args[])
    {
        int iCnt = 0;
        int iLength = 0;
        char[] cValue = null;
        String sValue = null;
        char cSearch = '\0';
        boolean bRet = false;

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

        bRet = dobj.ChkChar(cValue, iLength, cSearch);

        if(bRet == true)
        {
            System.out.println("Character "+cSearch+" is Present in String");
        }
        else
        {
            System.out.println("Character "+cSearch+" is Not Present in String");
        }
        sobj.close();
    }
}
