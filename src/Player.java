
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t.bohl
 */
public class Player {
    private String name;
    private int idealMoveProbability;
    private int pileSize;
    private boolean isComputerControlled;
    
    public Player(String name)
    {
        this.name = name;
    }
    
    public Player(String name, int idealMoveProbability, boolean isComputer)
    {
        this.name = name;
        this.idealMoveProbability = idealMoveProbability;
        isComputerControlled = isComputer;
        
    }
    
    public String getName()
    {
        return name;
    }
    
    
    
    public boolean isComputerControlled()
    {
        return isComputerControlled;
    }
    
    public int takeTurn(int pileSize)
    {
        int numberToTake = 0;
        Random rand = new Random();
        if (rand.nextInt(100+1) <= idealMoveProbability)
        {
            if (pileSize % 4 == 0)
            {
                numberToTake = rand.nextInt(3-1+1)+1;
            }
            numberToTake = pileSize % 4;
        }
        else
        {
            numberToTake = rand.nextInt(3-1+1)+1;
        }
        return numberToTake;   
    }
          
    
  
    
}
