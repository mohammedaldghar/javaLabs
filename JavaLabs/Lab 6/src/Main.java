import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        NewFrame data=new NewFrame();
        frame.setContentPane(data);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JFrame frame2=new JFrame("Animation Word");
        AnimationWord w = new AnimationWord();
        frame2.setContentPane(w);
        frame2.setSize(400,400);
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JFrame frame3=new JFrame("Animation Ball");
        AnimationBall b = new AnimationBall();
        frame3.setContentPane(b);
        frame3.setSize(400,400);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        

    }
}