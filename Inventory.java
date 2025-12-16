/**
 * The Inventory class keeps track of a player's Pokémon candies.
 * Players can collect small and big candies through random events,
 * and use them to power up or evolve their Pokémon.
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
     * Small candies are used to power up Pokémon.
     * 
     * @return the current count of small candies
     */
    public static int getSmallCandy() {
        return smallCandy;
    }
    
    /**
     * Returns the number of big candies in the player's inventory.
     * Big candies are used to evolve Pokémon.
     * 
     * @return the current count of big candies
     */
    public static int getBigCandy() {
        return bigCandy;
    }
    
    /**
     * Uses one small candy from the inventory to power up a Pokémon.
     * Decreases the small candy count by 1.
     * If no small candies are available, the count will go negative (consider adding a check).
     */
    public static void useSmallCandy() {
        smallCandy -= 1;
    }
    
    /**
     * Uses one big candy from the inventory to evolve a Pokémon.
     * Decreases the big candy count by 1.
     * If no big candies are available, the count will go negative (consider adding a check).
     */
    public static void useBigCandy() {
        bigCandy -= 1;
    }
}
