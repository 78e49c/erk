package com.example.erk;

public class Game {
    private static int hour = 6;
    private static int day = 1;

    public static void incrementTime()
    {
        if(hour<23) {hour++;}
        else {hour = 0; day++;}
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

}
