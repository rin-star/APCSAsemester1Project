/**
 * The {@code candy} class tracks the shared amount of candy available
 * using a static counter and provides methods to modify and read it.
 *
 * @Authors: Rin Ryu, Jacob Le, Ashlynn K, Natalee Ngo
 */
public class candy {
    /** The total amount of candy currently available. */
    public static int candyAmount = 0;

    /**
     * Increments the total candy amount by one.
     */
    // Method to add candy
    public static void addCandy() {
        candyAmount += 1;
    }

    /**
     * Returns the current total candy amount.
     *
     * @return the current candyAmount
     */
    public static int returnCandy() {
        return candyAmount;
    }
}
