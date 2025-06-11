////////////////////////////////////////////////////////////////
//
//  File Name   : program3.java
//  Description : Accept a N Integer & returns its last occurance of its index value
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : FirstOcc
//  Description   : Inputs N Integer & returns its last occurance of its index value 
//  Input         : Integer
//  Output        : Integer
//
////////////////////////////////////////////////////////////////

class Display
{
    
    public int LastOcc(int[] iPtr, int iSize, int iNo)
    {
        int iCnt = 0;
        int iCount = -1;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iPtr[iCnt] == iNo)
            {
                iCount = iCnt;
            }
        }

        return iCount;
    }
}

public class program3
{
    public static void main(String Args[])
    {
        int iCnt = 0;
        int[] iArr;
        int iLength = 0;
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Elements : ");
        iLength = sobj.nextInt();

        System.out.println("Enter the Number you Want Index Value of : ");
        iValue = sobj.nextInt();

        iArr =  new int[iLength];

        System.out.println("Enter the Elements : ");
        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println("Element "+(iCnt+1)+" : ");
            iArr[iCnt] = sobj.nextInt();
        }

        Display dobj = new Display();

        iRet = dobj.LastOcc(iArr, iLength, iValue);

        System.out.println("For Number "+iValue+" Index Value is : "+iRet);

        sobj.close();
    }
}
