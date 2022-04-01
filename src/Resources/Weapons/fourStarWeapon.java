package Resources.Weapons;

public class fourStarWeapon extends Weapon{
    public fourStarWeapon(String name, String type) {
        super(name, type, 4);
    }

    public static fourStarWeapon randFourStarWeapon (){
        fourStarWeapon[] list = new fourStarWeapon[4];
        list[0] = new Flute();
        list[1] = new LionsRoar();
        list[2] = new SacrificialSword();
        list[3] = new FavoniusSword();

        float n = (float) Math.random();
        n=n%4;
        return list[(int)n];
    }
}
