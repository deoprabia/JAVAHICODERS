package Farm;

import  Farmer.Chicken;
import  Farmer.Cow;


public class Farmer {

    public static void main (String[] args){
        Cow cowone = new Cow("Lila");
        Chicken chickenone = new Chicken("Green");
        System.out.println(cowone.CowName + "" + Cow.CowTotal);
        System.out.println(chickenone.ChickenName + "" + Chicken.ChickenTotal);
    }
}
