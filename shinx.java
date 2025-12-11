/**
 * The shinx class represents a Pokemon with attributes such as type,
 * evolution level, happiness, energy, health, and hunger, and provides
 * methods to interact with it.
 *
 * This class extends main and implements mainInterface.
 *
 * @author Rin Ryu
 * @author Jacob Le
 * @author Ashlynn K
 * @author Natalee Ngo
 */
public class shinx extends main implements mainInterface{
    //abstract means that any class that implements the interface MUST write these methods
    //there was an error before hand bec we didn't implement EVERY method -> maybe faint method??

    private String type;
    private int evolutionLevel;
    private int happiness;
    private int energy;
    private int health;
    private int hunger;

    // constructor for shinx object
    /**
     * Constructor for shinx object.
     * Initializes default stats such as type, evolution level, happiness, energy, health, and hunger.
     */
    public shinx()
    {
        this.type = "Electric";
        this.evolutionLevel = 1;
        this.happiness = 50;
        this.energy = 50;
        this.health = 100;
        this.hunger = 70;
    }

    /**
     * Displays the current status of this Pokemon, including type,
     * evolution level, happiness, energy, health, and hunger.
     */
    //display status
    public void displayStatus() 
        {
        System.out.println("Pokemon Type: " + this.type);
        System.out.println("Evolution Level: " + this.evolutionLevel);
        System.out.println("Happiness: " + this.happiness);
        System.out.println("Energy: " + this.energy);
        System.out.println("Health: " + this.health);
        System.out.println("Hunger: " + this.hunger);
        }

    /**
     * Triggers a random event that may increase happiness or add a rare candy.
     */
    // Methods
    public void randomEvent() {
        int occurence = (int)(Math.random() * 3) + 1;
        if (occurence == 1) {
            int randomChoice = (int)(Math.random() * 9) + 1;
            if (randomChoice == 1) {
                System.out.println("You've been blessed by Victini, your Pokemon gained 100 happiness!");
                this.happiness += 100;
            }

            else {
                System.out.println("You found a rare candy!");
                candy.addCandy();
            }
        }
    }
    
    /**
     * Lets this Pokemon play, increasing happiness and decreasing energy.
     */
    public void play() {
        System.out.println("Your Pokemon is playing!");
        this.happiness += 10;
        this.energy -= 5;
    }

    /**
     * Feeds this Pokemon, increasing hunger and possibly restoring some health.
     */
    public void feed() {
        this.hunger += 10;
        if (this.health + 5 <= 100) {
            this.health += 5;
            System.out.println("Your Pokemon has been fed and feels healthier!");
        }
        else {
            System.out.println("Your Pokemon has been fed!");
            this.health += 100 - this.health;
        }
    }

    /**
     * Gives this Pokemon a bath; non-fire types take damage and lose happiness.
     */
    public void giveBath() {
        if (!"Fire".equals(this.type)) {
            System.out.println("Your Pokemon is taking damage from the bath.");
            System.out.println("Your Pokemon is a fire type, don't bathe it!");
            this.health -= 5;
            this.happiness -= 10;
        }
        
        else {
            System.out.println("Your Pokemon is enjoying the bath!");
            this.happiness += 10;
        }
        
    }
    
    /**
     * Attempts to evolve this Pokemon depending on its happiness level.
     */
    public void evolve() {
        if (this.happiness >= 30) {
            evolutionLevel = 2;
            System.out.println("Shinx has evolved into Luxio!");
        }
        else if (this.happiness >= 80) {
            evolutionLevel = 3;
            System.out.println("Shinx has evolved into Luxray!");
        }
        else {
            System.out.print("Shinx is not happy enough to evolve.");
        }
    }

    /**
     * Feeds this Pokemon candy, increasing happiness and reducing hunger.
     */
    // feed pokemon candy
    public void feedCandy() {
        System.out.println("Your pokemon is eating candy!");
        this.happiness += 20;
        this.hunger -= 10;
    }

    /**
     * Heals this Pokemon using a Berry Juice, restoring up to 20 health
     * without exceeding 100.
     */
    public void heal(){
        System.out.println("Time to heal your Pokemon using... a potion!!");
        System.out.println("--A Berry Juice was used.--");
        if(this.health <= 80){
            this.health += 20;
        }else {
            this.health += 100 - this.health;
        }
    }

    /**
     * Simulates a battle against a trainer, changing happiness, health,
     * and energy based on a random outcome.
     */
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
        }
        else {
            System.out.print("The fight was a draw!");
            this.energy -= 20;
        }
    }

    /**
     * Handles user selection for this Pokemon.
     */
    @Override
    public void userPick(){
        main.userPick(this);
    }

    /**
     * Returns this Pokemon's type.
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets this Pokemon's type.
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns this Pokemon's evolution level.
     * @return the evolution level
     */
    // Getter and Setter for evolution
    public int getEvolutionLevel() {
        return evolutionLevel;
    }

    /**
     * Sets this Pokemon's evolution level.
     * @param evolutionLevel the evolution level to set
     */
    public void setEvolutionLevel(int evolutionLevel) {
        this.evolutionLevel = evolutionLevel;
    }

    /**
     * Returns this Pokemon's happiness.
     * @return the happiness
     */
    // Getter and Setter for happiness
    public int getHappiness() {
        return happiness;
    }

    /**
     * Sets this Pokemon's happiness.
     * @param happiness the happiness to set
     */
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    /**
     * Returns this Pokemon's energy.
     * @return the energy
     */
    // Getter and Setter for energy
    public int getEnergy() {
        return energy;
    }

    /**
     * Sets this Pokemon's energy.
     * @param energy the energy to set
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Returns this Pokemon's health.
     * @return the health
     */
    // Getter and Setter for health
    public int getHealth() {
        return health;
    }

    /**
     * Sets this Pokemon's health.
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Returns this Pokemon's hunger.
     * @return the hunger
     */
    // Getter and Setter for hunger
    public int getHunger() {
        return hunger;
    }

    /**
     * Sets this Pokemon's hunger.
     * @param hunger the hunger to set
     */
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

}
