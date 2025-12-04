public class riolu {

    private static int candy = 0;
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
    public static void recieveCandy() {
        System.out.print("Riolu found a candy! Candy added to inventory");
        candy++;
    }

    public void evolve() {
        if (happiness >= 30) {
            evolution level = 2;
        }
        
        else {
            System.out.print("Riolu is not happy enough to evolve.");
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

    private String getHealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    }