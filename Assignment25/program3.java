////////////////////////////////////////////////////////////////
//
//  File Name   : program3.java
//  Description : Accept a character character array coverting it into string and returns Toggle output of that String
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : strtogglex
//  Description   : Inputs character array coverting it into string and and returns Toggle output of that String
//  Input         : String
//  Output        : String
//
////////////////////////////////////////////////////////////////

class Display
{
    public void strtogglex(char[] chVal, int iSize)
    {
        int iCnt = 0;

        System.out.println("Toggeled Ouput of Entered String is : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((chVal[iCnt] >= 'A') && (chVal[iCnt] <= 'Z'))
            {
            System.out.print((char)(chVal[iCnt] + 32));      
            }
            else if((chVal[iCnt] >= 'a') && (chVal[iCnt] <= 'z'))
            {
                System.out.print((char)(chVal[iCnt] - 32));        
            }            
            else
            {
                System.out.print(chVal[iCnt]);
            } 
        }
    }
}


public class program3
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

        dobj.strtogglex(cValue, iLength);

        sobj.close();
    }
}