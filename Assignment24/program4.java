////////////////////////////////////////////////////////////////
//
//  File Name   : program4.java
//  Description : Accept a character character array coverting it into string and  check if String contains Vowel or not
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : ChkVowel
//  Description   : Inputs character array coverting it into string and check if String contains Vowel or not
//  Input         : String
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

class Display
{
    public boolean ChkVowel(char[] chVal, int iSize)
    {
        int iCnt = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(chVal[iCnt] == 'a' || chVal[iCnt] == 'e' || chVal[iCnt] == 'i' || chVal[iCnt] == 'o' || (chVal[iCnt] == 'u') ||
            chVal[iCnt] == 'A' || chVal[iCnt] == 'E' || chVal[iCnt] == 'I' || chVal[iCnt] == 'O' || chVal[iCnt] == 'U')    
            {
                return true;
            }
        }
        return false;
    }
}

public class program4 
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

        bRet = dobj.ChkVowel(cValue,iLength);

        if(bRet == true)
        {
            System.out.println("Vowel is Present");
        }
        else
        {
            System.out.println("Vowel is Not Present");
        }

        sobj.close();
    }
}