////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a N Integer & returns Product of Odd Elements
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Product
//  Description   : Inputs N Integer & returns Product of Odd Elements 
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int Product(int[] iPtr, int iSize)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0, iCount = 1; iCnt < iSize; iCnt++)
        {
            if((iPtr[iCnt] % 2) != 0)
            {
                iCount = iCount * iPtr[iCnt];
            }
            else
            {
                iCount = 0;
            }
        }
        return iCount;
    }
}

public class program5 
{
    public static void main(String Args[])
    {
        int[] iArr;
        int iCnt = 0;
        int iLength = 0;
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of elements : ");
        iLength = sobj.nextInt();

        iArr = new int[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println("Element "+(iCnt+1)+" : ");
            iArr[iCnt] = sobj.nextInt();
        }

        Display dobj = new Display();

        iRet = dobj.Product(iArr, iLength);

        System.out.println("The Product of Odd Elements : "+iRet);
    }    
}
