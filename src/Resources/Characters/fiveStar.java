package Resources.Characters;

public class fiveStar extends Chara {
    public fiveStar(String name, String type) {
        super(name, type,5);
    }

    public static fiveStar randomStandard(){
        fiveStar[] StandardCharacters = new fiveStar[6];
        StandardCharacters[0]=new Mona();
        StandardCharacters[1]=new Keqing();
        StandardCharacters[2]=new Diluc();
        StandardCharacters[3]=new Qiqi();
        StandardCharacters[4]=new Jean();

        float n = (float) Math.random();
        n =n%5;
        return StandardCharacters[(int)n];
    }
}
