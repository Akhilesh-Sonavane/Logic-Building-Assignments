////////////////////////////////////////////////////////////////
//
//  File Name   : program3.java
//  Description : Accept a Integer and Print Unique Pattern
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 22/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Pattern
//  Function Name : Display
//  Description   : Inputs a Integer and returns Pattern 
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Pattern 
{
    public void Display(int iNo)
    {
        int iCnt = 0;
    
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+"\t*\t");
        }
    }
}
public class program3
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

