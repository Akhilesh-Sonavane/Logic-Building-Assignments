////////////////////////////////////////////////////////////////
//
//  File Name   : program1.java
//  Description : Accept a N Integer & a integer and check whether it is present or not 
//  Author      : Akhilesh.P.Sonavane.
//  Date        : 29/05/2025
//
////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////
// 
//  Class Name    : Display
//  Function Name : Check
//  Description   : Inputs N Integer & a Integer and check whether it is present 
//  Input         : Integer
//  Output        : Boolean
//
////////////////////////////////////////////////////////////////

class Display
{
    
    public boolean Check(int[] iPtr, int iSize, int iNo)
    {
        int iCnt = 0;
        boolean bResult = false;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iPtr[iCnt] == iNo)
            {
                bResult = true; 
                break;
            }
            else
            {
                bResult = false;
            }
            
        }

        return bResult;
    }
}

public class program1
{
    public static void main(String Args[])
    {
        int iCnt = 0;
        int[] iArr;
        int iLength = 0;
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Elements : ");
        iLength = sobj.nextInt();

        System.out.println("Enter the Number you Want to Search : ");
        iValue = sobj.nextInt();

        iArr =  new int[iLength];

        System.out.println("Enter the Elements : ");
        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println("Element "+(iCnt+1)+" : ");
            iArr[iCnt] = sobj.nextInt();
        }

        Display dobj = new Display();

        bRet = dobj.Check(iArr, iLength, iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Present");
        }
        else
        {
            System.out.println(iValue+" is Not Present");
        }

        sobj.close();
    }
}
