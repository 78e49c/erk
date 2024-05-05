package game;

import java.util.Random;

public class Game {
    private static int hour = 6;
    private static int day = 1;

    private static int mammals = 64;
    private static int birds = 128;
    private static int eggs = 128;

    private static int trees = 512;
    private static int bushes = 1024;
    private static int herbs = 2048;

    public static void incrementTime()
    {
        timeSetting();
        if(hour == 6) {
            arrangeMammalStatus();
            arrangeBirdStatus();
        }
    }

    public static String showHour()
    {
        if(hour<10){
            return "Saat: "+"0"+hour+".00";
        }
            else
        {return "Saat: "+hour+".00";}
    }
    public static String showDay()
    {
        return day+". gün";
    }

    public static void timeSetting()
    {
        if(hour<23) {hour++;}
        else {hour = 0; day++;}
    }

    private static void arrangeMammalStatus(){
        if(mammals>2)
        {
            Random random = new Random();
            mammals = mammals + random.nextInt(128/mammals);
        }

    }

    private static void arrangeBirdStatus(){
        if(birds>2)
        {
            Random random = new Random();
            eggs = eggs + random.nextInt(256/birds);
        }

        Random random = new Random();

        int dead = random.nextInt(2*eggs/3*birds);
        int hatched = random.nextInt(eggs/4);

        eggs = eggs - (dead + hatched);
        birds = birds + hatched;

    }

}
