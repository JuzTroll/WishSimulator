package Resources.Weapons;

import Resources.HighestStars;

public class Weapon extends HighestStars {
    String name;
    String type;
    int stars;
    int refinement = 0;

    public Weapon(String name, String type, int stars){
        this.name = name;
        this.type = type;
        this.stars = stars;
        this.refinement++;
    }




}
