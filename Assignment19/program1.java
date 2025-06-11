////////////////////////////////////////////////////////////////
//
//  File Name   : program1.java
//  Description : Accept a N Integer and returns Even Element Frequency
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : CountEven
//  Description   : Inputs N Integer and returns its even elements frequency 
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int CountEven(int[] iPtr, int iSize)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((iPtr[iCnt] % 2) == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}
public class program1 
{
    public static void main(String args[])
    {
        int[] iArr;
        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;
    
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

        iRet = dobj.CountEven(iArr,iLength);

        System.out.println("The Frequency of Even Elements is : "+iRet);

        sobj.close(); 
    }
}
