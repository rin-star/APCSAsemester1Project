public class Inventory {
    private static int bigCandy = 0;
    private static int smallCandy = 0;
    
    //methods
    public static void randomEvent(){
        int rand1 = (int)(Math.random() * 4) + 1;
        if (rand1 == 1){
            int rand2 = (int)(Math.random() * 10) + 1;
            if (rand2 == 1){
                bigCandy += 1;
            }
            
            else{
                smallCandy += 1;
            }
        }
    }
    
    public static int getSmallCandy(){
        return smallCandy;
    }
    
    public static int getBigCandy(){
        return bigCandy;
    }
    
    public static void useSmallCandy(){
        smallCandy -= 1;
    }
    
    public static void useBigCandy(){
        bigCandy -= 1;
    }
}