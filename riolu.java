public class riolu implements Pokemon {
    //instance variables
    private String type;
    private String pokemonEvo;
    private int happiness;
    private int energy;
    private int health;
    private int hunger;
    
    //constructor
    public riolu() {
        this.pokemonEvo = "Riolu";
        this.type = "Fighting";
        this.happiness = 0;
        this.energy = 50;
        this.health = 100;
        this.hunger = 20;
    }
    
    //methods
    public void returnStats(){
        System.out.println("Evolution:" + this.pokemonEvo);
        System.out.println("Health: " + this.health);
        System.out.println("Happiness:" + this.happiness);
        System.out.println("Energy:" + this.energy);
        System.out.print("Hunger: " + this.hunger);
    }
    
    public void feed(){
        System.out.println("You fed your Pokemon!");
        if (this.health + 10 > 100){
            if (this.hunger + 5 > 20){
                this.hunger += 20 - this.hunger;
                this.health += 100 - this.health;
            }
            else {
                this.hunger += 5;
                this.health += 100 - this.health;
            }
        }
        else {
            this.hunger += 5;
            this.health += 10;
        }
    }
    
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
    
    public void rest() {
        System.out.println("Your Pokemon is taking a nap!");
        this.energy += 20;
    }
    
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
    public int getHealth() {
        return this.health;
    }

    /**
     * Attempts to evolve this Pokemon depending on its happiness level.
     */
    // evolve pokemon
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