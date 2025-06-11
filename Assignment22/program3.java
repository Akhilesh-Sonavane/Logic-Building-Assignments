////////////////////////////////////////////////////////////////
//
//  File Name   : program3.java
//  Description : Accept a character and checks whether it is a Digit or not
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : ChkDigit
//  Description   : Inputs character and checks whether it is a Digit or not
//  Input         : Character
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

class Display
{

    public boolean ChkDigit(char ch)
    {
        boolean bResult = false;

        if((ch >= '0') && (ch <= '9'))
        {
            bResult = true;
        }
        else
        {
            bResult = false;
        }
        
        return bResult;
    }
}
public class program3
{
    public static void main(String args[])
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter value you wanna Check : ");
        cValue = sobj.next().charAt(0);

        Display dobj = new Display();

        bRet = dobj.ChkDigit(cValue);

        if(bRet == true)
        {
            System.out.println("The Entered Value "+cValue+" is a Digit");
        }
        else
        {
            System.out.println("The Entered Value "+cValue+" is Not a Digit");
        }

        sobj.close();
    }
}

