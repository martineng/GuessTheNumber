/*
 */
package guessthenumber.java;

public class MergeSort 
{
    private int[] arrayToSort;
    
    public MergeSort()
    {
        // EMPTY
    }
    
    public MergeSort(int[] inArray)
    {
        arrayToSort = inArray;
    }
    
    public void doMergeSort(int inLeftStart, int inRightEnd)
    {
        // Left Start is the first position
        // Right End is the last posiion
        // As Merge Sort will break into two part,
        // I decide to call it Left and Right for easy understanding of my code.
        
        int middle;
        
        if (inLeftStart < inRightEnd)
        {
            middle = inLeftStart + (inRightEnd - inLeftStart) / 2;
            
            doMergeSort(inLeftStart, middle);
            doMergeSort(middle + 1, inRightEnd);
            merge(inLeftStart, middle, inRightEnd);
        } // END IF
    } // END doMergeSort()
    
    public void merge(int inLeftStart, int inMiddle, int inRightEnd)
    {
        int left, index, rightStart, counterSort;
        int[] tempArray = new int[10];
        left = inLeftStart;
        index = inLeftStart;
        rightStart = inMiddle + 1;
        
        while ((left <= inMiddle) && (rightStart <= inRightEnd))
        {
            if (arrayToSort[left] <= arrayToSort[rightStart])
            {
                tempArray[index] = arrayToSort[left];
                left++;
            } // END IF
            else
            {
                tempArray[index] = arrayToSort[rightStart];
                rightStart++;
            } // END else
            
            index++;
        } // END WHILE
        
        if (left > inMiddle)
        {
            for (counterSort = rightStart; counterSort <= inRightEnd; counterSort++)
            {
                tempArray[index] = arrayToSort[counterSort];
                index++;
            } // END FOR
        } // END IF
        else
        {
            for (counterSort = left; counterSort <= inMiddle; counterSort++)
            {
                tempArray[index] = arrayToSort[counterSort];
                index++;
            } //END FOR
        } // END ELSE
        
        for (counterSort = inLeftStart; counterSort <= inRightEnd; counterSort++)
        {
            arrayToSort[counterSort] = tempArray[counterSort];
        } // END FOR
    } // END merge()
    
    public int[] getArrayToSort()
    {
        return arrayToSort;
    }
}
