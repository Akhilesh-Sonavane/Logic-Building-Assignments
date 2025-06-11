////////////////////////////////////////////////////////////////
//
//  File Name   : program3.java
//  Description : Accept a N Integer & return Difference of Minimum & Maximum Value 
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Difference
//  Description   : Inputs N Integer & return Difference of Minimum & Maximum Value 
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int Difference(int[] iPtr, int iSize)
    {
        int iMin = 0;
        int iMax = 0;
        int iDiff = 0;
        int iCnt = 0;

        iMax = iPtr[0];

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iPtr[iCnt] > iMax)
            {
                iMax = iPtr[iCnt];
            }
        }

        iMin = iPtr[0];

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iPtr[iCnt] < iMin)
            {
                iMin = iPtr[iCnt];
            }
        }

        iDiff = iMax - iMin;

        return iDiff;
    }
}
public class program3
{
    public static void main(String Args[])
    {
        int iCnt = 0;
        int[] iArr = null;
        int iLength = 0;
        int iRet = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Elements : ");
        iLength = sobj.nextInt();

        iArr = new int[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println("Element "+(iCnt+1)+" : ");
            iArr[iCnt] = sobj.nextInt();
        }

        Display dobj = new Display();

        iRet = dobj.Difference(iArr, iLength);

        System.out.println("The Difference in Minimum and Maximum Value is : "+iRet);

        sobj.close();
    }
}

