////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a Integer and Print 'Character' Pattern
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 22/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Pattern
//  Function Name : Display
//  Description   : Inputs a Integer and returns 'Character' Pattern
//  Input         : Integer
//  Output        : Character
//
////////////////////////////////////////////////////////////////

class Pattern 
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = iCol; j >= 1; j--)
            {
                System.out.print(i+"\t");
            }
            System.out.print("\n\n");
        }
    }
}
public class program5
{
    public static void main(String[] args) 
    {
        int iValue1 = 0;
        int iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Number of Coloumns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);

        sobj.close();
    }
}