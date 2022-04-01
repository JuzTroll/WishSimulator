package Resources.Characters;

public class fourStar extends Chara {
    public fourStar(String name, String type) {
        super(name, type, 4);
    }

    public static fourStar randomFourStar(){
        fourStar[] list = new fourStar[3];
        list[0] = new YunJin();
        list[1] = new Xiangling();
        list[2] = new Sucrose();

        float n = (float) Math.random();
        n =n%3;
        return list[(int)n];
    }
    public static fourStar randomFourStar2(){
        fourStar[] list = new fourStar[3];
        list[0] = new Beidou();
        list[1] = new Xingqiu();
        list[2] = new Diona();

        float n = (float) Math.random();
        n =n%3;
        return list[(int)n];
    }
}
