////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a N Integer & Inputs N Integer & return summation of each digit
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : DigitSum
//  Description   : Inputs N Integer & return summation of each digit
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public void DigitSum(int[] iPtr, int iSize)
    {
        int iDigit = 0;
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            int iNo = 0;
            int iSum = 0;
            
            iNo = iPtr[iCnt];

            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iSum = iSum + iDigit;
                iNo = iNo / 10;
            }
                System.out.println("Summation of Element "+iPtr[iCnt]+" is : "+iSum);
        }
    }
}
public class program5
{
    public static void main(String Args[])
    {
        int iCnt = 0;
        int[] iArr = null;
        int iLength = 0;
    
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

        dobj.DigitSum(iArr, iLength);

        sobj.close();
    }
}
