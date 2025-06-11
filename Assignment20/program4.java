////////////////////////////////////////////////////////////////
//
//  File Name   : program4.java
//  Description : Accept a N Integer & returns Range Values
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Range
//  Description   : Inputs N Integer & returns its Range Values
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public void Range(int[] iPtr, int iSize, int iRangeStart, int iRangeEnd)
    {
        int iCnt = 0;

        System.out.println("Numbers in between Range of "+iRangeStart+" to "+iRangeEnd+" are : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((iPtr[iCnt] >= iRangeStart) && (iPtr[iCnt] <= iRangeEnd))
            {
                System.out.println("Number "+(iCnt+1)+" : "+iPtr[iCnt]);
            }
        }
    }
}
public class program4
{
    public static void main(String Args[])
    {
        int[] iArr;
        int iCnt = 0;
        int iLength = 0;
        int iStart = 0;
        int iEnd = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Elements : ");
        iLength = sobj.nextInt();

        System.out.println("Enter The Start of Range : ");
        iStart = sobj.nextInt();

        System.out.println("Enter The End of Range : ");
        iEnd = sobj.nextInt();

        iArr = new int[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println("Element "+(iCnt+1)+" : ");
            iArr[iCnt] = sobj.nextInt();
        }

        Display dobj = new Display();

        dobj.Range(iArr, iLength, iStart, iEnd);

        sobj.close();
    }
}
