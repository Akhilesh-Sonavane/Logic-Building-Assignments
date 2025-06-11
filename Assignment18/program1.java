////////////////////////////////////////////////////////////////
//
//  File Name   : program1.java
//  Description : Accept N number of elements and display the summation difference of Even & Odd elements 
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Difference
//  Function Name : EvenOdd
//  Description   : Inputs a N Integers and returns summation difference of Even & Odd elements 
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Difference
{
    public int EvenOdd(int[] iPtr, int iSize)
    {
        int iCnt = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        if (iSize <= 0) 
        {
    
        System.out.println("Invalid array size!");
        
        return -1;
        
        }

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((iPtr[iCnt] % 2) == 0)
            {
                iEvenSum = iEvenSum + iPtr[iCnt];
            }
            else
            {
                iOddSum = iOddSum + iPtr[iCnt];
            }
        }

        return iEvenSum - iOddSum;
    }
}
public  class program1 
{
    public static void main(String args[])
    {
        int iCnt = 0;
        int[] iArr;
        int iLength = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number of Elements\n");
        iLength = sobj.nextInt();

        iArr = new int[iLength]; // Memory allocation to Array by using Reference (Pointers)

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println("Element "+(iCnt+1)+":");
            iArr[iCnt] = sobj.nextInt();
        }

        Difference dobj = new Difference();

        iRet = dobj.EvenOdd(iArr, iLength);

        System.out.println("The Summation Difference  of Even & Odd Elements is : "+iRet);

        sobj.close();
    }
}
