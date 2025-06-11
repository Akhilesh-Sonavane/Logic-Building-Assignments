////////////////////////////////////////////////////////////////
//
//  File Name   : program1.java
//  Description : Accept a character and checks whether it is a character or not
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : ChkAlpha
//  Description   : Inputs character and checks whether it is a character or not
//  Input         : Character
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

class Display
{

    public boolean ChkAlpha(char ch)
    {
        boolean bResult = false;

        if(((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')))
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
public class program1
{
    public static void main(String args[])
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter value you wanna Check : ");
        cValue = sobj.next().charAt(0);

        Display dobj = new Display();

        bRet = dobj.ChkAlpha(cValue);

        if(bRet == true)
        {
            System.out.println("The Entered Value "+cValue+" is a Character");
        }
        else
        {
            System.out.println("The Entered Value "+cValue+" is Not a Character");
        }

        sobj.close();
    }
}
