
package Resources.Characters;

import Resources.HighestStars;

public class Chara extends HighestStars {
    private String name;
    private String type;
    private int stars;
    private int constellation=0;

public Chara(String name, String type, int stars) {
        this.name = name;
        this.type = type;
        this.stars = stars;
    }


}
