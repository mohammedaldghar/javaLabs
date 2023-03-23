import javax.swing.*;
import java.awt.*;

public class AnimationWord extends JPanel {
    int x=100;
    int y =100;
    AnimationWord(){
        this.setBackground(Color.gray);
        new Thread(()->{
            try {
                while (true){
                    x+=10;
                    if (x>this.getWidth()){x=0;}
                    this.repaint();
                    Thread.sleep(1000);
                }


            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawString("Hello Java",x,y);
    }
}
