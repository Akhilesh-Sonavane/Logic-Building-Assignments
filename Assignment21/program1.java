////////////////////////////////////////////////////////////////
//
//  File Name   : program1.java
//  Description : Accept a N Integer & returns Maximum Value from all elements
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Maximum
//  Description   : Inputs N Integer & returns Maximum Value from all elements
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int Maximum(int[] iPtr, int iSize)
    {
        int iMax = 0;
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iPtr[iCnt] > iMax)
            {
                iMax = iPtr[iCnt];
            }
        }
        return iMax;
    }
}
public class program1
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

        iRet = dobj.Maximum(iArr, iLength);

        System.out.println("The Maximum Value in all Elements is : "+iRet);

        sobj.close();
    }
}
