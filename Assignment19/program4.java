////////////////////////////////////////////////////////////////
//
//  File Name   : program4.java
//  Description : Accept a N Integer and returns Frequency of 11 in all elements 
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 25/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : CheckFrequency
//  Description   : Inputs N Integer and returns Frequency of 11 in all elements
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int CheckFrequency(int[] iPtr, int iSize)
    {
        int iCnt = 0;
        int iFreq = 0;
     
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iPtr[iCnt] == 11)
            {
               iFreq = (iCnt+1);
               break;
            }
        }
        return iFreq;
    }
}
public class program4
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

        iRet = dobj.CheckFrequency(iArr, iLength);

        System.out.println("Frequency of 11 from "+iLength+" elements is :  "+iRet);
        
        sobj.close();
    }
} 