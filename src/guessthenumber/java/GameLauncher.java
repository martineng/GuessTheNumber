/*
 */
package guessthenumber.java;

import java.util.Scanner;

public class GameLauncher 
{
    private boolean isEmpty1Correct, isEmpty2Correct, isEmpty3Correct;
    private Game theGame;
    private Scanner inputScanner = new Scanner(System.in);
    
    public GameLauncher()
    {
        theGame = new Game();
        setIsEmpty1Correct(false);
        setIsEmpty2Correct(false);
        setIsEmpty3Correct(false);
    }
    
    // Setter
    protected void setIsEmpty1Correct(boolean isCorrect)
    {
        isEmpty1Correct = isCorrect;
    }
    
    protected void setIsEmpty2Correct(boolean isCorrect)
    {
        isEmpty2Correct = isCorrect;
    }
    
    protected void setIsEmpty3Correct(boolean isCorrect)
    {
        isEmpty3Correct = isCorrect;
    }
    
    // Getter
    protected boolean getIsEmpty1Correct()
    {
        return isEmpty1Correct;
    }
    
    protected boolean getIsEmpty2Correct()
    {
        return isEmpty2Correct;
    }
    
    protected boolean getIsEmpty3Correct()
    {
        return isEmpty3Correct;
    }
    
    protected boolean isEmpty(int inGuess)
    {
        // If any of the imported value matches,
        // proceed to the next IF statement in printQuiz().
        
        if (inGuess == theGame.getEmpty1() || inGuess == theGame.getEmpty2() || inGuess == theGame.getEmpty3())
        {
            return true;
        }
        else
        {
            return false;
        }
    } // END isEmpty()
    
    protected void printQuiz()
    {
        for (int count = 0; count < 10; count++)
        {
            if (isEmpty(count))
            {
                if (count == theGame.getEmpty1() && getIsEmpty1Correct() == false)
                {
                    System.out.print(" [__] ");
                }
                else if (count == theGame.getEmpty2() && getIsEmpty2Correct() == false)
                {
                    System.out.print(" [__] ");
                }
                else if (count == theGame.getEmpty3() && getIsEmpty3Correct() == false)
                {
                    System.out.print(" [__] ");
                }
                else
                {
                    // IF this possition already guess it right
                    System.out.print(" [" + theGame.getNumberArrayValue(count) + "] ");
                }
            } // END IF
            else
            {
                System.out.print(" [" + theGame.getNumberArrayValue(count) + "] ");
            } // END ELSE
        } // END FOR
    } // END printQuiz()
    
    protected int promptGuess()
    {
        int userGuess = 0;
        
        System.out.println("Etner 1010 to exit");
        System.out.println("Enter Your Guess!");
        userGuess = inputScanner.nextInt();
        return userGuess;
    }
    
    protected boolean isAnswer(int inAnswer)
    {
        int searchResult;
        boolean isResultMatch = false;
        
        if (inAnswer == 1010)
        {
            System.out.println("Player give up!");
            searchResult = 0;
            isResultMatch = true;
            
            setIsEmpty1Correct(true);
            setIsEmpty2Correct(true);
            setIsEmpty3Correct(true);
        }
        else
        {
            
        }
        
        return false;
    }
    
    protected boolean isAllCorrect()
    {
        // IF all returned true,
        // the game is over
        
        if (getIsEmpty1Correct() && getIsEmpty2Correct() && getIsEmpty3Correct())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
