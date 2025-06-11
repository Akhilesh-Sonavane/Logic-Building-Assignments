////////////////////////////////////////////////////////////////
//
//  File Name   : program5.java
//  Description : Accept a N Integer and returns Frequency of Input Integer in all elements 
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : CheckFrequency
//  Description   : Inputs N Integer and returns Frequency of Input Integer in all elements
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    public int CheckFrequency(int[] iPtr, int iSize, int iNo)
    {
        int iCnt = 0;
        int iFreq = 0;
     
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iPtr[iCnt] == iNo)
            {
               iFreq = (iCnt+1);
               break;
            }
        }
        return iFreq;
    }
}
public class program5
{
    public static void main(String args[])
    {
        int[] iArr;
        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;
        int iValue = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Elements : ");
        iLength = sobj.nextInt();

        System.out.println("Enter Number you want the frequency : ");
        iValue = sobj.nextInt();
        
        iArr = new int[iLength];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.print("Element "+(iCnt+1)+" : ");
            iArr[iCnt] = sobj.nextInt();
        }

        Display dobj = new Display();

        iRet = dobj.CheckFrequency(iArr, iLength, iValue);

        System.out.println("Frequency of "+iValue+" from "+iLength+" elements is :  "+iRet);
        
        sobj.close();
    }
} 