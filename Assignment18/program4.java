////////////////////////////////////////////////////////////////
//
//  File Name   : program4.java
//  Description : Accept N number of elements and display which are divisible by 3 & 5
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Check
//  Description   : Inputs a N Integers and checks which elements are divisible by 3 & 5
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display 
{
    public void Check(int[] iPtr, int iSize)
    {
        int iCnt = 0;

        System.out.println("Elements which are divisible by 3 & 5 are : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(((iPtr[iCnt] % 3) == 0) && ((iPtr[iCnt] % 5) == 0))
            {
                System.out.println(iPtr[iCnt]);
            }
        }
    }
}

public class program4
{
    public static void main(String args[])
    {
        int[] iArr;
        int iLength = 0;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of elements : ");
        iLength = sobj.nextInt();

        iArr = new int[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.print("Element "+(iCnt+1)+" : ");
            iArr[iCnt] = sobj.nextInt();
        }

        Display dobj = new Display();

        dobj.Check(iArr, iCnt);

        sobj.close();
    }   
}
