/*
 */
package guessthenumber.java;

public class BinarySearch 
{
    private int first, last, middle;
    private int[] arrayToSearch;
    
    public BinarySearch()
    {
        
    }
    
    public BinarySearch(int[] inArray, int inFirst, int inLast)
    {
        arrayToSearch = inArray;
        
        first = inFirst;
        last = inLast;
        middle = (first+last / 2);
    }
    
    public int doBinarySearch(int intToSearch)
    {
        int positionFound = 0;
        
        while (first <= last)
        {
            if (arrayToSearch[middle] < intToSearch)
            {
                first = middle + 1;
            }
            else if (arrayToSearch[middle] == intToSearch)
            {
                positionFound = middle; // Found the target!
                break;
            }
            else
            {
                last = middle - 1;
            }
            
            middle = (first + last) / 2;
        } // END WHILE 
        
        if (first > last)
        {
            positionFound = 404; // Target Not Found!
        }
        
        return positionFound;
    }
    
    
}
