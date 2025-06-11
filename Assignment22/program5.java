////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a character and allocates Division wise Schedule
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Schedule
//  Description   : Inputs character and allocates Division wise Schedule
//  Input         : Character
//  Output        : String
//
////////////////////////////////////////////////////////////////

class Display
{
    public void Schedule(char ch)
    {
        if((ch == 'A') || (ch == 'a'))
        {
            System.out.println("Exam time : 7.00 AM");
        }
        else if((ch == 'B') || (ch == 'b'))
        {
            System.out.println("Exam time : 8.30 AM");
        }
        else if((ch == 'C') || (ch == 'c'))
        {
            System.out.println("Exam time : 9.20 AM");
        }
        else if((ch == 'D') || (ch == 'd'))
        {
            System.out.println("Exam time : 10.30 AM");
        }
        else 
        {
            System.out.println("Invalid Input");
        }
    }
}
public class program5
{
    public static void main(String args[])
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Division to check Schedule : ");
        cValue = sobj.next().charAt(0);

        Display dobj = new Display();

        dobj.Schedule(cValue);

        sobj.close();
    }
}
