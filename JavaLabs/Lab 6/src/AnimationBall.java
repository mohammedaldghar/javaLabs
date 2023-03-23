import javax.swing.*;
import java.awt.*;

public class AnimationBall extends JPanel {
    int x=0;
    int y =0;
    int deltaX=10;
    int deltaY=10;
    int colorFlag=0;
    AnimationBall(){
    this.setBackground(Color.gray);
        new Thread(()->{
        try {


            while (true){
                this.repaint();
                Thread.sleep(500);
                updatePos();
            }


        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }).start();
    }

public  void updatePos(){
        x+=deltaX;
        y+=deltaY;
        if ((y+20)>=this.getHeight()){
            deltaY=-deltaY;
            if (colorFlag==0){
                colorFlag=1;
            }else if (colorFlag==1){
                colorFlag=0;
            }
        }
        if ((x+20)>=this.getWidth()){
            deltaX=-deltaX;
            if (colorFlag==0){
                colorFlag=1;
            }else if (colorFlag==1){
                colorFlag=0;
            }
        }
    if (y<=0){
        deltaY=-deltaY;
        if (colorFlag==0){
            colorFlag=1;
        }else if (colorFlag==1){
            colorFlag=0;
        }
    }
    if (x<=0){
        deltaX=-deltaX;
        if (colorFlag==0){
            colorFlag=1;
        }else if (colorFlag==1){
            colorFlag=0;
        }
    }

}
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (colorFlag==0){
            g.setColor(Color.red);
        }else {g.setColor(Color.blue);}
        g.fillOval(x,y,20,20);
    }
}
