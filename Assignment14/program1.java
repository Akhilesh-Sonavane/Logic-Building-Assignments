////////////////////////////////////////////////////////////////
//
//  File Name   : program1.java
//  Description : Accept a Integer and Print 'Integer' Pattern
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 22/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Pattern
//  Function Name : Display
//  Description   : Inputs a Integer and returns 'Integer' Pattern
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Pattern 
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iCnt = 0;
        iCnt = 1;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
               if(iCnt > 9)
               {
                    iCnt = 1;
               }   
                System.out.print(iCnt+"\t");
                iCnt++;
            }

            System.out.print("\n\n");
        }
    }
}
public class program1
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
