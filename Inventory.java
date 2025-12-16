/**
 * The Inventory class keeps track of a player's Pokémon candies.
 * Players can collect small and big candies through random events
 * and feed them to their Pokémon. Feeding candy increases the Pokémon's happiness,
 * while big candies may also help evolve certain Pokémon.
 * 
 * This class is used in conjunction with the main game loop in main.java.
 * 
 * @author Rin Ryu
 * @collaborators ChatGPT, Ashlynn Kirchoff, Jacob Le, Natalee Ngo
 * @version 12/15/25
 */
public class Inventory {
    /** The number of big candies in the player's inventory. */
    private static int bigCandy = 0;
    
    /** The number of small candies in the player's inventory. */
    private static int smallCandy = 0;
    
    /**
     * Simulates a random Pokémon event that may reward the player with candy.
     * There is a 25% chance that the player finds candy. If candy is found,
     * there is a 10% chance it will be a big candy; otherwise, a small candy is received.
     */
    public static void randomEvent() {
        int rand1 = (int)(Math.random() * 4) + 1;
        if (rand1 == 1) {
            int rand2 = (int)(Math.random() * 10) + 1;
            if (rand2 == 1) {
                bigCandy += 1;
            } else {
                smallCandy += 1;
            }
        }
    }
    
    /**
     * Returns the number of small candies in the player's inventory.
     * Small candies can be fed to Pokémon to increase their happiness.
     * 
     * @return the current count of small candies
     */
    public static int getSmallCandy() {
        return smallCandy;
    }
    
    /**
     * Returns the number of big candies in the player's inventory.
     * Big candies can be fed to Pokémon to increase their happiness,
     * and may also help certain Pokémon evolve.
     * 
     * @return the current count of big candies
     */
    public static int getBigCandy() {
        return bigCandy;
    }
    
    /**
     * Uses one small candy from the inventory to feed a Pokémon.
     * Feeding candy increases the Pokémon's happiness.
     * Decreases the small candy count by 1.
     * Note: The inventory does not check if candies are available before use.
     */
    public static void useSmallCandy() {
        smallCandy -= 1;
    }
    
    /**
     * Uses one big candy from the inventory to feed a Pokémon.
     * Feeding big candy increases the Pokémon's happiness and may trigger evolution.
     * Decreases the big candy count by 1.
     * Note: The inventory does not check if candies are available before use.
     */
    public static void useBigCandy() {
        bigCandy -= 1;
    }
}
