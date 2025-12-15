/**
 * The riolu class represents a Pokemon with specific attributes such as type,
 * evolution stage, happiness, energy, health, and hunger. It provides methods
 * to display stats and feed the Pokemon.
 * 
 * @author Ashlynn Kirchoff
 * @author collaborator: VS Copilot
 * @updated 12/15/2025
 */

public class riolu implements Pokemon {
    //instance variables
    private String type;
    private String pokemonEvo;
    private int happiness;
    private int energy;
    private int health;
    private int hunger;
    
    // Constructor
    /**
     * Constructs a new riolu object with default values for its attributes.
     */
    public riolu() {
        this.pokemonEvo = "Riolu";
        this.type = "Fighting";
        this.happiness = 0;
        this.energy = 50;
        this.health = 100;
        this.hunger = 20;
    }
    
    // Methods
    /**
     * Displays the current stats of the Pokemon in a readable format.
     * This includes the Pokemon's evolution stage, health, happiness, energy, and hunger.
     * Useful for monitoring the Pokemon's current state.
     */
    public void returnStats(){
        System.out.println("Evolution:" + this.pokemonEvo);
        System.out.println("Health: " + this.health);
        System.out.println("Happiness:" + this.happiness);
        System.out.println("Energy:" + this.energy);
        System.out.println("Hunger: " + this.hunger);
    }
    /**
     * Feeds the Pokemon, increasing its health and hunger levels.
     * - Health is increased by 10, but it cannot exceed the maximum value of 100.
     * - Hunger is increased by 5, but it cannot exceed the maximum value of 20.
     * If the Pokemon's health or hunger is already near its maximum, the method
     * ensures that the values do not exceed their limits.
     */
    public void feed(){
        System.out.println("You fed your Pokemon!");
        //check if health or hunger will exceed max values
        if (this.health + 10 > 100){
            if (this.hunger + 5 > 20){
                this.hunger += 20 - this.hunger;
                this.health += 100 - this.health;
            }
            else {
                this.hunger += 5;
                this.health += 100 - this.health;
            }
        //simply add values if not exceeding max
        }
        else {
            this.hunger += 5;
            this.health += 10;
        }
    }
    /**
     * Allows the Pokemon to play, increasing its happiness and decreasing its energy.
     * If the Pokemon does not have enough energy to play, it takes damage, reducing
     * its health and happiness.
     */    
    public void play() {
        if (energy - 5 >= 0){
            System.out.println("Your Pokemon is playing!");
            this.happiness += 10;
            this.energy -= 5;
        }
        else if (energy - 5 < 0) {
            System.out.println("Your Pokemon is too fatigued. It took damage!");
            this.energy -= 5;
            this.health -= 10;
            this.happiness -= 10;
        }
    }
    /**
     * Allows the Pokemon to play, increasing its happiness and decreasing its energy.
     * If the Pokemon does not have enough energy to play, it takes damage, reducing
     * its health and happiness.
     */    
    public void rest() {
        System.out.println("Your Pokemon is taking a nap!");
        this.energy += 20;
    }
    /**
     * Feeds the Pokemon a candy, which increases its happiness based on the type of candy.
     * A "Big" candy increases happiness by 75, while a "Small" candy increases happiness by 25.
     * The candy is consumed from the inventory.
     *
     * @param userInput The type of candy to feed the Pokemon ("Big" or "Small").
     */    
    public void feedCandy(String userInput){
        if (userInput.equalsIgnoreCase("Big")){
            System.out.println("You fed your Pokemon a big candy!");
            this.happiness += 75;
            Inventory.useBigCandy();
        }
        
        else if (userInput.equalsIgnoreCase("Small")){
            System.out.println("You fed your Pokemon a small candy!");
            this.happiness += 25;
            Inventory.useSmallCandy();
        }
    }
    /**
     * Gives the Pokemon a bath. If the Pokemon is a fire type, it takes damage
     * and loses happiness due to its weakness to water. Otherwise, it enjoys the bath.
     */    
    public void giveBath(){
        if (type.equals("Fire")){
            System.out.println("Your Pokemon is a fire type. It took damage!");
            this.health -= 20;
            this.happiness -= 20;
        }
        
        else {
            System.out.println("You gave your Pokemon a bath!");
            this.happiness += 20;
            this.energy += 10;
        }
    }
    /**
     * Gets the current health of the Pokemon.
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Attempts to evolve this Pokemon depending on its happiness level.
     */
    public void evolve() {
        if (this.happiness >= 200) {
            String currentPokemon = this.pokemonEvo;
            pokemonEvo = "Lucario";
            System.out.println(currentPokemon + " has evolved into " + pokemonEvo + "!");
        }
        else if (this.happiness >= 500) {
            String currentPokemon = this.pokemonEvo;
            pokemonEvo = "Mega Lucario";
            System.out.println(currentPokemon + " has evolved into " + pokemonEvo + "!");
        }
        else {
            System.out.print(pokemonEvo + " is not happy enough to evolve.");
        }
    }

    /**
     * Simulates a battle against a trainer, changing happiness, health,
     * and energy based on a random outcome.
     */
    // method to fight a trainer
    public void fightTrainer() {
        System.out.println("Your pokemon is fighting a trainer!");
        int randNum = (int)(Math.random() * 3) + 1;
        if (randNum == 1) {
            System.out.print("Your pokemon won the fight!");
            this.happiness += 40;
            this.energy -= 20;
        }
        if (randNum == 2) {
            System.out.print("Your pokemon lost the fight!");
            this.health -= 40;
            this.energy -= 30;
            this.happiness -= 20;
        }
        else {
            System.out.print("The fight was a draw!");
            this.energy -= 20;
        }
    }

    /**
     * Heals this Pokemon using a Berry Juice, restoring up to 20 health
     * without exceeding 100.
     */
    public void heal(){
        System.out.println("Time to heal your Pokemon using... a potion!!");
        System.out.println("--A Hyper Potion was used.--");
        if(this.health <= 80){
            this.health += 20;
        }else {
            this.health += 100 - this.health;
        }
    }

    
}