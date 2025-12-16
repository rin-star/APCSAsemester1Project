/**
 * Interface representing a generic Pokemon in the Virtual Pet Simulation.
 * Defines common behaviors and actions that all Pokemon must implement.
 * 
 * Methods include actions for feeding, playing, evolving, healing, resting,
 * giving baths, and battling trainers.
 * 
 * @author Ashlynn Kirchoff
 * @collaborators VS Copilot, Natalee Ngo, Jacob Le, Rin Ryu
 * @version 12/15/2025
 */
public interface Pokemon {

    /**
     * Prints the current stats of the Pokemon, including
     * evolution stage, health, happiness, energy, and hunger.
     */
    public void returnStats();

    /**
     * Attempts to evolve the Pokemon based on its current
     * happiness or other conditions defined in the implementing class.
     */
    public void evolve();

    /**
     * Feeds the Pokemon, increasing health and hunger levels
     * according to the rules defined in the implementing class.
     */
    public void feed();

    /**
     * Gives the Pokemon a bath. May affect health, happiness, or energy
     * depending on the Pokemon's type or other conditions.
     */
    public void giveBath();

    /**
     * Heals the Pokemon, restoring its health by a specific amount.
     */
    public void heal();

    /**
     * Allows the Pokemon to play, which affects happiness and energy.
     * May also affect health if the Pokemon is too fatigued.
     */
    public void play();

    /**
     * Simulates a battle against a trainer, modifying the Pokemon's
     * health, energy, and happiness depending on the outcome.
     */
    public void fightTrainer();

    /**
     * Returns the current health value of the Pokemon.
     * 
     * @return the current health (integer value)
     */
    public int getHealth();

    /**
     * Feeds the Pokemon a candy, which modifies its happiness
     * based on the type or size of candy.
     * 
     * @param userInput the type of candy ("Big" or "Small")
     */
    public void feedCandy(String userInput);

    /**
     * Allows the Pokemon to rest, restoring energy points.
     */
    public void rest();
}
