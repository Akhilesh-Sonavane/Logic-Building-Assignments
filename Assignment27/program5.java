////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a String and a Integer and returns Conacted format of String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : StrCatX
//  Description   : Inputs String and a Integer and returns Concated format of String
//  Input         : String
//  Output        : String
//
////////////////////////////////////////////////////////////////

class Display
{
    public void StrCatX(char[] chVal1, char[] chVal2, int iSize1, int iSize2)
    {
        int iCount = 0;
        int iCnt1 = 0;
        int iCnt2 = 0;
        char[] cResult = null;

        cResult = new char[iSize1+iSize2];

        for(iCnt1 = 0; iCnt1 < iSize1; iCnt1++, iCount++)
        {
            cResult[iCount] = chVal1[iCnt1];
        }

        for(iCnt2 = 0; iCnt2 < iSize2; iCnt2++, iCount++)
        {
            cResult[iCount] = chVal2[iCnt2];
        }

        System.out.println("Concatenated String is: ");
        for(iCount = 0; iCount < cResult.length; iCount++)
        {
            System.out.print(cResult[iCount]);
        }
    }
}

public class program5
{
    public static void main(String args[])
    {
        int iCnt = 0;
        int iLength1 = 0;
        int iLength2 = 0;
        char[] chArr1 = null;
        char[] chArr2 = null;
        String sValue1 = null;
        String sValue2 = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String1 : ");
        sValue1 = sobj.nextLine();
        
        
        System.out.println("Enter String2 : ");
        sValue2 = sobj.nextLine();

        iLength1 = sValue1.length();
        iLength2 = sValue2.length();

        chArr1 = new char[iLength1];
        chArr2 = new char[iLength2];

        for(iCnt = 0; iCnt < iLength1; iCnt++)
        {
            chArr1[iCnt] = sValue1.charAt(iCnt);
        }

        for(iCnt = 0; iCnt < iLength2; iCnt++)
        {
            chArr2[iCnt] = sValue2.charAt(iCnt);
        }

        Display dobj = new Display();

        dobj.StrCatX(chArr1,chArr2,iLength1,iLength2);

        sobj.close();
    }
}
