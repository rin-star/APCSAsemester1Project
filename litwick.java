public class litwick extends main implements mainInterface{
// Declares litwick as a subclass of Pokemon that must implement methods from mainInterface

    private String type;
    private int evolutionLevel;
    private int happiness;
    private int energy;
    private int health;
    private int hunger;


    // constructor for litwick object
    public litwick()
    {
        this.type = "Fire";
        this.evolutionLevel = 1;
        this.happiness = 50;
        this.energy = 50;
        this.health = 100;
        this.hunger = 70;
    }
    //display status
    @Override
    public void displayStatus() 
        {
        System.out.println("Pokemon Type: " + this.type);
        System.out.println("Evolution Level: " + this.evolutionLevel);
        System.out.println("Happiness: " + this.happiness);
        System.out.println("Energy: " + this.energy);
        System.out.println("Health: " + this.health);
        System.out.println("Hunger: " + this.hunger);
        }

    // Methods
    public void play() {
        System.out.println("Your Pokemon is playing!");
        this.happiness += 10;
        this.energy -= 5;
    }

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
        public void evolve() {
        if (this.happiness >= 30) {
            evolutionLevel = 2;
            System.out.println("Litwick has evolved into Lampent!");
        }
        else if (this.happiness >= 80) {
            evolutionLevel = 3;
            System.out.println("Lampent has evolved in Chandedelure!");
        }
        else {
            System.out.print("Litwick is not happy enough to evolve.");
        }
        }

    public void heal(){
        System.out.println("Time to heal your Pokemon using... a potion!!");
        System.out.println("--A Berry Juice was used.--");
        if(this.health <= 80){
            this.health += 20;
        }else {
            this.health += 100 - this.health;
        }
    }
    
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
        }
        else {
            System.out.print("The fight was a draw!");
            this.energy -= 20;
        }
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter for evolutionLevel
    public int getEvolutionLevel() {
        return evolutionLevel;
    }

    public void setEvolutionLevel(int evolutionLevel) {
        this.evolutionLevel = evolutionLevel;
    }

    // Getter and Setter for happiness
    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    // Getter and Setter for energy
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // Getter and Setter for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and Setter for hunger
    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
}