////////////////////////////////////////////////////////////////
//
//  File Name   : program4.java
//  Description : Accept a character character array coverting it into String and checks if its a special character or not
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : ChkSpecial
//  Description   : Inputs character array coverting it into string and checks if its a special character or not
//  Input         : String
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

class Display
{
    public boolean ChkSpecial(char[] chVal, int iSize)
    {
        int iCnt = 0;
        boolean bResult = false;

        while(iCnt < iSize) 
        {
            if((chVal[iCnt] >= 'A') && (chVal[iCnt] <= 'Z') || (chVal[iCnt] >= 'a') && (chVal[iCnt] <= 'z') || (chVal[iCnt] >= '0') && (chVal[iCnt] <= '9'))
            {
                bResult = false;
            }
            else
            {
                bResult = true;
            }
            iCnt++;
        }
        return bResult;
    }    
}

public class program4
{
    public static void main(String args[])
    {
        int iCnt = 0;
        char[] cValue = null;
        String sInput = null;
        int iLength = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character : ");
        sInput = sobj.nextLine();

        iLength = sInput.length();

        cValue = new char[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            cValue[iCnt] = sInput.charAt(iCnt);
        }

        Display dobj = new Display();

        bRet = dobj.ChkSpecial(cValue, iLength);
        
        if(bRet == true) 
        {
            System.out.println("The Entered Value is a Special Character");    
        }
        else
        {
            System.out.println("The Entered Value is Not a Special Character");
        }

        sobj.close();
    }
}
