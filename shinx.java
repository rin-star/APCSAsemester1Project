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
    public shinx()
    {
        this.type = "Electric";
        this.evolutionLevel = 1;
        this.happiness = 50;
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
    // feed pokemon candy
    public void feedCandy() {
        System.out.println("Your pokemon is eating candy!");
        this.happiness += 20;
        this.hunger -= 10;
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
    public int getHealth() {
        return health;
    }
    }