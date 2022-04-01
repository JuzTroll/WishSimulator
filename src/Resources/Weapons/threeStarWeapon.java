package Resources.Weapons;

public class threeStarWeapon extends Weapon{
    public threeStarWeapon(String name, String type) {
        super(name, type, 3);
    }

    public static threeStarWeapon randomThreeStarWeapon(){
        threeStarWeapon[] list = new threeStarWeapon[1];
        list[0] = new ThrillingTales();
        list[1] = new DebateClub();

        float n = (float) Math.random();
        n=n%2;
        return list[(int)n];
    }
}
