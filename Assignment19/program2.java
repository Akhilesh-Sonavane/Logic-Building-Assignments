////////////////////////////////////////////////////////////////
//
//  File Name   : program2.java
//  Description : Accept a N Integer and returns Even & Odd Element Frequency Difference
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : CountEvenOdd
//  Description   : Inputs N Integer and returns its even & odd elements frequency difference 
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int CountEvenOdd(int[] iPtr, int iSize)
    {
        int iCnt = 0;
        int iCountEven = 0;
        int iCountOdd = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((iPtr[iCnt] % 2) == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }
        return iCountEven - iCountOdd;
    }
}
public class program2
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

        iRet = dobj.CountEvenOdd(iArr,iLength);

        System.out.println("The Frequency Difference of Even and Odd Elements is : "+iRet);

        sobj.close();
    }
} 