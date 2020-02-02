package com.antriksh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by antjain on 1/24/20.
 */
public class TryStuff
{
    public static void main1(String... args) throws Exception
    {
        String[] words = {"handy","bite-sized","likeable","cheap","crime","skillful","river","glib","maddening","hungry","old-fashioned","deceive","minute","treat","fruit","earth","prefer","offbeat","purple","wide-eyed","plate","invention","agreement","radiate","pricey","doll","grape","fat","alive","sparkling","mighty","blade","grateful","straight","quilt","statuesque","scientific","sign","nebulous","spiders","daffy","approval","wide","beds","trouble","lunchroom","colour","whimsical","thaw","bell","hydrant","skate","rainy","crowded","toe","saw","shaggy","disgusted","land","power","shiver","familiar","crowd","existence","star","daily","tree","relax","fit","precede","zippy","unkempt","crooked","relieved","aftermath","nifty","cheat","four","story","berserk","innate","gun","symptomatic","reproduce","odd","crabby","testy","last","lopsided","lively","dock","obnoxious","join","typical","shoes","turkey","beginner","lunch","drown","bag"};

        int i = 0;
        for(String word : words)
        {
            ++i;
            String itemId = "toddler-" + word;
            String style = "Apparel";
            String color = "Black";

            if(word.toLowerCase().startsWith("a") || word.toLowerCase().startsWith("b") || word.toLowerCase().startsWith("c")
             || word.toLowerCase().startsWith("d") || word.toLowerCase().startsWith("e") || word.toLowerCase().startsWith("f"))
            {
                style = "Instrument";
            }
            else if(word.toLowerCase().startsWith("g") || word.toLowerCase().startsWith("h") || word.toLowerCase().startsWith("i")
                || word.toLowerCase().startsWith("j") || word.toLowerCase().startsWith("k") || word.toLowerCase().startsWith("l"))
            {
                style = "Stationary";
            }
            else if(word.toLowerCase().startsWith("m") || word.toLowerCase().startsWith("n") || word.toLowerCase().startsWith("o")
                    || word.toLowerCase().startsWith("p") || word.toLowerCase().startsWith("q") || word.toLowerCase().startsWith("r"))
            {
                style = "Peripherals";
            }
            if(i < 10 ||  (i > 100 && i <200))
            {
                color = "Red";
            }
            else if(i < 20 ||(i > 200 && i <300))
            {
                color = "Blue";
            }
            else if(i < 30 || (i > 300 && i <400))
            {
                color = "Purple";
            }
            else if(i < 40 || (i > 400 && i <500))
            {
                color = "Green";
            }
            else if(i < 50 || (i > 500 && i <600))
            {
                color = "White";
            }
            else if(i < 60 || (i > 600 && i <700))
            {
                color = "Grey";
            }
            else if(i < 70 || (i > 700 && i <800))
            {
                color = "Pink";
            }
            else if(i < 80 || (i > 800 && i <900))
            {
                color = "Orange";
            }
            else if(i < 90 || (i > 900 && i <1001))
            {
                color = "Yellow";
            }

            System.out.println(itemId + "-v1-AID," + itemId + ",2,Ship-to-Home,toddler-stuff");
            System.out.println(itemId + "-v2-AID," + itemId + ",2,Ship-to-Home-with-Filters,toddler-stuff");
        }

    }

}
