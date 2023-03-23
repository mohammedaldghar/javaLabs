import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class NewFrame extends JPanel {
    NewFrame(){
        this.setBackground(Color.gray);
        new Thread(()->{
            try {
                    while (true){
                        this.repaint();
                        Thread.sleep(1000);
                    }


            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawString(new Date().toString(),100,100);
    }
}
