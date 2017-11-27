/*
 */
package guessthenumber.java;

import java.util.Random;

public class Game 
{
    private int [] numberArray;
    private int empty1, empty2, empty3;
    
    // Null Constructor
    public Game()
    {
        MergeSort theMergeSort = new MergeSort();
        
        initializeNumberArray();
        
        theMergeSort = new MergeSort(numberArray);
        numberArray = theMergeSort.getArrayToSort();
        
        initializeEmptySlots();
    }
    
    // Setter
    public void setEmpty1(int inEmpty)
    {
        empty1 = inEmpty;
    }
    
    public void setEmpty2(int inEmpty)
    {
        empty2 = inEmpty;
    }
    
    public void setEmpty3(int inEmpty)
    {
        empty3 = inEmpty;
    }
    
    // Getter
    public int getEmpty1()
    {
        return empty1;
    }
    
    public int getEmpty2()
    {
        return empty2;
    }
    
    public int getEmpty3()
    {
        return empty3;
    }
    
    public int getNumberArrayValue(int inIndex)
    {
        return numberArray[inIndex];
    }
    
    // Generate a random number between 0 to inRange
    private int generateRandomNumber(int inRange)
    {
        Random rand = new Random();
        
        return rand.nextInt(inRange);
    }
    
    private void initializeNumberArray()
    {
        numberArray = new int[10];
        
        for (int index = 0; index < 10; index++)
        {
            numberArray[index] = generateRandomNumber(98) + 1; // Eliminate 0
        } // END FOR
    }
    
    private void initializeEmptySlots()
    {
        //Simple rule"
        // except for the first, middle and last position of the array,
        // randomly select an empty slot before and after the middle.
        
        setEmpty1(generateRandomNumber(2));
        setEmpty2(3);
        setEmpty3(generateRandomNumber(4)+4);
    }
}
