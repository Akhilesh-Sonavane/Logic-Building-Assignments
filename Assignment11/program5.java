////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a Integer and Print even integer Pattern
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 22/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Pattern
//  Function Name : Display
//  Description   : Inputs a Integer and returns Pattern of even integers
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Pattern 
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
            return;
        }

        for(iCnt = 2; iCnt <= (iNo*2); iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    
    }
}
public class program5
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue);

        sobj.close();
    }
}

