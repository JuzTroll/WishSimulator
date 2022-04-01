import javax.swing.*;
import java.awt.*;

public class Anim extends JFrame{
    private ImageIcon image;
    private JLabel label;
    private ImageIcon image1;
    private JLabel label1;

    public Anim(int x){
        switch(x) {
            case 1:
                setLayout(new FlowLayout());

                image = new ImageIcon(getClass().getResource("wishYellow.png"));

                label = new JLabel(image);
                add(label);
                break;
            case 2:
                setLayout(new FlowLayout());

                image = new ImageIcon(getClass().getResource("wishPurple.png"));

                label = new JLabel(image);
                add(label);
                break;
            case 3:
                setLayout(new FlowLayout());

                image = new ImageIcon(getClass().getResource("wish6.png"));

                label = new JLabel(image);
                add(label);
                waitABit.doIt(500);
                break;
        }
    }


}
