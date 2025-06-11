////////////////////////////////////////////////////////////////
//
//  File Name   : program3.java
//  Description : Accept a N Integer and Checks if 11 is Present in Elements 
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 22/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Check
//  Description   : Inputs N Integer and Checks if 11 is Present in Elements 
//  Input         : Integer
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

class Display
{
    public boolean Check(int[] iPtr, int iSize)
    {
        int iCnt = 0;
        boolean bResult = false;
     
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iPtr[iCnt] == 11)
            {
                bResult = true;
                break;
            }
        }

        return bResult;
    }
}
public class program3
{
    public static void main(String args[])
    {
        int[] iArr;
        int iLength = 0;
        int iCnt = 0;
        boolean bRet = false;
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Elements : ");
        iLength = sobj.nextInt();

        iArr = new int[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.print("Element "+(iCnt+1)+" : ");
            iArr[iCnt] = sobj.nextInt();
        }

        Display dobj = new Display();

        bRet = dobj.Check(iArr, iLength);

        if(bRet == true)
        {
            System.out.println("11 is Present");
        }
        else
        {
            System.out.println("11 is Absent");
        }

        sobj.close();
    }
} 