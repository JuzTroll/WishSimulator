import Resources.Characters.*;
import Resources.HighestStars;
import Resources.Weapons.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    protected int fivePity = 0;
    protected int fourPity = 0;

    public int getPity() {
        return this.fivePity;
    }

    public void reset5Pity() {
        this.fivePity = 0;
    }

    public void reset4Pity() {
        this.fourPity = 0;
    }

    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {


        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton button1 = new JButton("Wish :)");
        button1.addActionListener(this);


        label = new JLabel("Pity: 0");

        panel.setBorder(BorderFactory.createEmptyBorder
                (200, 200, 40, 40));
        panel.setLayout(new GridLayout(0, 1));

        panel.add(button1);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The Bois");
        frame.pack();
        frame.setVisible(true);

    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private int wishRaritate() {
        float bulan5 = (float) Math.random();
        float bulan4 = bulan5;

        if(this.fivePity==90) {
            reset5Pity();
            return 5;
        }
        if(this.fourPity==10) {
            reset4Pity();
            return 4;
        }
        if (this.fivePity >= 85)
            bulan5 += 0.5;
        else if (this.fivePity >= 80)
            bulan5 += 0.4;
        else if (this.fivePity >= 75)
            bulan5 += 0.3;

        if (bulan5 * 1000 >= 994) {
            reset5Pity();
            return 5;
        }
        else if (bulan4 * 1000>= 950) {
            reset4Pity();
            return 4;
        }
        else return 3;
    }


    public HighestStars wish2(int rarity) {
        float luck = (float) (Math.random() * 10);
        if (rarity == 5) {
            if (luck >= 5) {
                KamisatoAyato ayato = new KamisatoAyato();
                return ayato;
            } else {
                return fiveStar.randomStandard();
            }
        } else if (rarity == 4) {
            if (luck >= 5) {
                return fourStar.randomFourStar();
            } else {
                int weaponOrChar = getRandomNumber(1, 2);
                if (weaponOrChar == 1) {
                    return fourStarWeapon.randFourStarWeapon();
                } else {
                    return fourStar.randomFourStar2();
                }
            }
        } else {
            return threeStarWeapon.randomThreeStarWeapon();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fivePity++;
        fourPity++;

        Anim animation;
        int rar = wishRaritate();
        if (rar == 5) {
            animation = new Anim(1);
            animation.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            animation.pack();
            animation.setVisible(true);

        } else if (rar == 4) {
            animation = new Anim(2);
            animation.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            animation.pack();
            animation.setVisible(true);

        } else{
            animation = new Anim(3);
            animation.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            animation.pack();
            animation.setVisible(true);
        }
        if(animation.isActive()) {
            waitABit.doIt(500);
        }
        label.setText("Pity: " + this.fivePity);
    }
}
