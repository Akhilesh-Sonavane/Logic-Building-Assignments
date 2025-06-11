////////////////////////////////////////////////////////////////
//
//  File Name   : program2.java
//  Description : Accept a character and checks whether it is a Upper Case character or not
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : ChkCapital
//  Description   : Inputs character and checks whether it is a upper case character or not
//  Input         : Character
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

class Display
{

    public boolean ChkCapital(char ch)
    {
        boolean bResult = false;

        if((ch >= 'A') && (ch <= 'Z'))
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
public class program2
{
    public static void main(String args[])
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter value you wanna Check : ");
        cValue = sobj.next().charAt(0);

        Display dobj = new Display();

        bRet = dobj.ChkCapital(cValue);

        if(bRet == true)
        {
            System.out.println("The Entered Value "+cValue+" is a UpperCase Character");
        }
        else
        {
            System.out.println("The Entered Value "+cValue+" is Not a UpperCase Character");
        }

        sobj.close();
    }
}

