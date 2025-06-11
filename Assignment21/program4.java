////////////////////////////////////////////////////////////////
//
//  File Name   : program4.java
//  Description : Accept a N Integer & displays all three digit Values  
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Digit
//  Description   : Inputs N Integer & displays all three digit Values 
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public void Digit(int[] iPtr, int iSize)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((iPtr[iCnt] >= 100) && iPtr[iCnt] <= 999)
            {
                System.out.println("Value "+(iCnt+1)+" : "+iPtr[iCnt]);
            }
        }
    }
}
public class program4
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

        dobj.Digit(iArr, iLength);

        sobj.close();
    }
}

