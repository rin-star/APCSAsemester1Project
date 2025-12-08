public class riolu  implements mainInterface{

    private String type;
    private int evolutionLevel;
    private int happiness;
    private int energy;
    private int health;
    private int hunger;

    public riolu()
    {
        this.type = "Steel";
        this.evolutionLevel = 1;
        this.happiness = 0;
        this.energy = 50;
        this.health = 100;
        this.hunger = 70;
    }
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

     // Methods
    public void play() {
        System.out.println("Your Pokemon is playing!");
        this.happiness += 10;
        this.energy -= 5;
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
    // evolve pokemon
    public void evolve() {
        if (this.happiness >= 30) {
            evolutionLevel = 2;
            System.out.println("Riolu has evolved into Lucario!");
        }
        else if (this.happiness >= 80) {
            evolutionLevel = 3;
            System.out.println("Riolu has mega evolved!");
        }
        else {
            System.out.print("Riolu is not happy enough to evolve.");
        }
    }
    // feed pokemon candy
    public void feedCandy() {
        System.out.println("Your pokemon is eating candy!");
        this.happiness += 20;
        this.hunger -= 10;
    }

    //fight
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

    //feed pokemon
    public void feed() {
        this.hunger += 10;
        if (this.health + 5 <= 100) {
            this.health += 5;
        }
        else {
            this.health += 100 - this.health;
        }
    }
    //
    public void heal(){
        System.out.println("Time to heal your Pokemon using... a potion!!");
        System.out.println("--A Berry Juice was used.--");
        if(this.health <= 80){
            this.health += 20;
        }else {
            this.health += 100 - this.health;
        }
    }
    
        // Getter and Setter for type
        public String getType() {
            return type;
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