
////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Ascii
//  Description   : Displays Full Ascii Table
//  Input         : Character
//  Output        : Character
//
////////////////////////////////////////////////////////////////

class Display
{
    public void Ascii()
    {
        String[] controlChars = {
            "NUL", "SOH", "STX", "ETX", "EOT", "ENQ", "ACK", "BEL",
            "BS", "TAB", "LF", "VT", "FF", "CR", "SO", "SI",
            "DLE", "DC1", "DC2", "DC3", "DC4", "NAK", "SYN", "ETB",
            "CAN", "EM", "SUB", "ESC", "FS", "GS", "RS", "US"
        };

        System.out.println("ASCII Table:");
        System.out.println("-----------------------------");
        System.out.println("Decimal\tCharacter");
        System.out.println("-----------------------------");

        for (int i = 0; i <= 127; i++)
        {
            if (i >= 0 && i <= 31)
            {
                System.out.println(i + "\t" + controlChars[i]);
            }
            else if (i == 127)
            {
                System.out.println(i + "\tDEL");
            }
            else
            {
                System.out.println(i + "\t" + (char)i);
            }
        }
    }
}

////////////////////////////////////////////////////////////////
//
//  File Name   : program1.java
//  Description : Displays Full Ascii Table
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

public class program1
{
    public static void main(String args[])
    {
        Display obj = new Display();
        obj.Ascii();
    }
}
