////////////////////////////////////////////////////////////////
//
//  File Name   : program2.java
//  Description : Accept a String and a Integer and returns Frequency of String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : StrNCpyX
//  Description   : Inputs String and a Integer and returns Frequency of String
//  Input         : String
//  Output        : String
//
////////////////////////////////////////////////////////////////

class Display
{
    public void StrNCpyX(char[] chVal1, char[] chVal2, int iSize, int iNo)
    {
        int iCnt = 0;

        if((chVal1 == null) || (iNo < 0))
        {
            System.out.println("Invalid Input");
            return;
        }

        while((iCnt < iNo) && (iCnt < iSize)) 
        {
            chVal2[iCnt] = chVal1[iCnt];
            iCnt++;
        }

        System.out.println("From Character "+chVal2[0]+" For Frequency "+iNo+" String is : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.print(chVal2[iCnt]);
        }
    }
}

public class program2
{
    public static void main(String args[])
    {
        int iCnt = 0;
        int iLength = 0;
        char[] chArr1 = null;
        char[] chArr2 = null;
        String sValue = null;
        int iFreq = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        sValue = sobj.nextLine();

        System.out.println("Enter Frequency : ");
        iFreq = sobj.nextInt();
        
        iLength = sValue.length();

        chArr1 = new char[iLength];
        chArr2 = new char[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            chArr1[iCnt] = sValue.charAt(iCnt);
        }

        Display dobj = new Display();

        dobj.StrNCpyX(chArr1,chArr2,iLength,iFreq);

        sobj.close();
    }
}