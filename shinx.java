/**
 * Represents a Shinx Pokémon with basic stats, behaviors, and evolution.
 * Implements the {@link Pokemon} interface.
 * Tracks health, energy, hunger, happiness, and evolution stage.
 * 
 * @author Rin Ryu
 * @collaborators ChatGPT, Ashlynn Kirchoff, Jacob Le, Natalee Ngo
 * @version 12/15/25
 */
public class shinx implements Pokemon {

    // Instance variables
    private String type;
    private String pokemonEvo;
    private int happiness;
    private int energy;
    private int health;
    private int hunger;

    /**
     * Constructs a new Shinx Pokémon with default stats.
     * Evolution stage is set to "Shinx", type is "Electric",
     * happiness is 0, energy is 50, health is 100, and hunger is 20.
     */
    public shinx() {
        this.pokemonEvo = "Shinx";
        this.type = "Electric";
        this.happiness = 0;
        this.energy = 50;
        this.health = 100;
        this.hunger = 20;
    }

    /**
     * Prints the current stats of the Pokémon, including
     * evolution stage, health, happiness, energy, and hunger.
     */
    public void returnStats() {
        System.out.println("Evolution:" + this.pokemonEvo);
        System.out.println("Health: " + this.health);
        System.out.println("Happiness:" + this.happiness);
        System.out.println("Energy:" + this.energy);
        System.out.print("Hunger: " + this.hunger);
    }

    /**
     * Feeds the Pokémon, increasing hunger and health
     * without exceeding their maximum values.
     */
    public void feed() {
        System.out.println("You fed your Pokemon!");
        if (this.health + 10 > 100) {
            if (this.hunger + 5 > 20) {
                this.hunger += 20 - this.hunger;
                this.health += 100 - this.health;
            } else {
                this.hunger += 5;
                this.health += 100 - this.health;
            }
        } else {
            this.hunger += 5;
            this.health += 10;
        }
    }

    /**
     * Allows the Pokémon to play, increasing happiness
     * but decreasing energy. If energy is too low, health
     * and happiness decrease instead.
     */
    public void play() {
        if (energy - 5 >= 0) {
            System.out.println("Your Pokemon is playing!");
            this.happiness += 10;
            this.energy -= 5;
        } else {
            System.out.println("Your Pokemon is too fatigued. It took damage!");
            this.energy -= 5;
            this.health -= 10;
            this.happiness -= 10;
        }
    }

    /**
     * Lets the Pokémon rest, restoring 20 energy.
     */
    public void rest() {
        System.out.println("Your Pokemon is taking a nap!");
        this.energy += 20;
    }

    /**
     * Feeds the Pokémon a candy, increasing happiness
     * depending on the candy size.
     * 
     * @param userInput "Big" for big candy, "Small" for small candy
     */
    public void feedCandy(String userInput) {
        if (userInput.equalsIgnoreCase("Big")) {
            System.out.println("You fed your Pokemon a big candy!");
            this.happiness += 75;
            Inventory.useBigCandy();
        } else if (userInput.equalsIgnoreCase("Small")) {
            System.out.println("You fed your Pokemon a small candy!");
            this.happiness += 25;
            Inventory.useSmallCandy();
        }
    }

    /**
     * Gives the Pokémon a bath. Fire-type Pokémon take damage
     * while other types gain happiness and energy.
     */
    public void giveBath() {
        if (type.equals("Fire")) {
            System.out.println("Your Pokemon is a fire type. It took damage!");
            this.health -= 20;
            this.happiness -= 20;
        } else {
            System.out.println("You gave your Pokemon a bath!");
            this.happiness += 20;
            this.energy += 10;
        }
    }

    /**
     * Returns the current health of the Pokémon.
     * 
     * @return health value (0-100)
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Attempts to evolve the Pokémon depending on its happiness level.
     * Evolves from Shinx → Luxio → Luxray if thresholds are met.
     */
    public void evolve() {
        if (this.happiness >= 500) {
            String currentPokemon = this.pokemonEvo;
            pokemonEvo = "Luxray";
            System.out.println(currentPokemon + " has evolved into " + pokemonEvo + "!");
        } else if (this.happiness >= 200) {
            String currentPokemon = this.pokemonEvo;
            pokemonEvo = "Luxio";
            System.out.println(currentPokemon + " has evolved into " + pokemonEvo + "!");
        } else {
            System.out.print(pokemonEvo + " is not happy enough to evolve.");
        }
    }

    /**
     * Simulates a battle against a trainer, randomly affecting
     * health, energy, and happiness.
     */
    public void fightTrainer() {
        System.out.println("Your pokemon is fighting a trainer!");
        int randNum = (int) (Math.random() * 3) + 1;
        if (randNum == 1) {
            System.out.print("Your pokemon won the fight!");
            this.happiness += 40;
            this.energy -= 20;
        } else if (randNum == 2) {
            System.out.print("Your pokemon lost the fight!");
            this.health -= 40;
            this.energy -= 30;
            this.happiness -= 20;
        } else {
            System.out.print("The fight was a draw!");
            this.energy -= 20;
        }
    }

    /**
     * Heals the Pokémon using a Hyper Potion, restoring
     * up to 20 health without exceeding 100.
     */
    public void heal() {
        System.out.println("Time to heal your Pokemon using... a potion!!");
        System.out.println("--A Hyper Potion was used.--");
        if (this.health <= 80) {
            this.health += 20;
        } else {
            this.health += 100 - this.health;
        }
    }

}
