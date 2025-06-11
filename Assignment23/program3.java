////////////////////////////////////////////////////////////////
//
//  File Name   : program3.java
//  Description : Accepts a Character and displays incremented format for UpperCase Characters
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Conversion
//  Description   : Inputs a Character and  displays incremented format for UpperCase Characters
//  Input         : Character
//  Output        : Character
//
////////////////////////////////////////////////////////////////

class Display
{
    public void Conversion(char cVal)
    {
        int iCnt = 0;

        if((cVal >= 'A') && (cVal <= 'Z'))
        {
            while(cVal <= 'Z')
            {
                System.out.println(" "+cVal);
                cVal++;
            }
        }
        
        else if((cVal >= 'a') && (cVal <= 'z'))
        {
            while(cVal >= 'a')
            {
                System.out.println(" "+cVal);
                cVal--;
            }
        }
        else 
        {
            return;
        }
    }
}

public class program3
{
    public static void main(String args[])
    {
        char cValue = '\0';
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character : ");
        cValue = sobj.next().charAt(0);

        Display dobj = new Display();

        dobj.Conversion(cValue);

        sobj.close();
    }
} 
