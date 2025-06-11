////////////////////////////////////////////////////////////////
//
//  File Name   : program2.java
//  Description : Accept a N Integer & returns Minimum Value from all elements
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Minimum
//  Description   : Inputs N Integer & returns Minimum Value from all elements
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int Minimum(int[] iPtr, int iSize)
    {
        int iMin = 0;
        int iCnt = 0;

        iMin = iPtr[0]; // Initialize First Element to iMin;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iPtr[iCnt] < iMin)
            {
                iMin = iPtr[iCnt];
            }
        }
        return iMin;
    }
}
public class program2
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

        iRet = dobj.Minimum(iArr, iLength);

        System.out.println("The Minimum Value in all Elements is : "+iRet);

        sobj.close();
    }
}
