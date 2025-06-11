////////////////////////////////////////////////////////////////
//
//  File Name   : program2.java
//  Description : Accepts a Character and Converts it if its in Lower to Upper Case
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Conversion
//  Description   : Inputs a Character and Converts it if its in Lower to Upper Case
//  Input         : Character
//  Output        : Character
//
////////////////////////////////////////////////////////////////

class Display
{
    public char Conversion(char cVal)
    {
        if((cVal >= 'A') && (cVal <= 'Z'))
        {
            cVal = (char)(cVal + 32);
        }
       
        else if((cVal >= 'a') && (cVal <= 'z'))
        {
            cVal = (char)(cVal - 32);
        }
        else 
        {
            cVal = cVal;
        }
        return cVal;
    }
}

public class program2
{
    public static void main(String args[])
    {
        char cValue = '\0';
        char cRet = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character : ");
        cValue = sobj.next().charAt(0);

        Display dobj = new Display();

        cRet = dobj.Conversion(cValue);

        System.out.println("The Conversion of Character "+cValue+" is : "+cRet);

        sobj.close();
    }
} 
