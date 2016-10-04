import java.awt.*;
import javax.swing.*;

public class ASSN1p3 extends JFrame{

  public ASSN1p3(){
    super();
  }

  public void paint(Graphics g){
    //New Color - Face
    g.setColor(Color.yellow);
    g.fillOval(100, 50, 190, 200);
    //New Color - Eyes
    g.setColor(Color.BLACK);
    g.fillOval(155, 100, 10, 10);
    g.fillOval(230, 100, 10, 10);
    //New Color - Glasses
    g.setColor(Color.BLUE);
    g.drawOval(145, 95, 30, 20);
    g.drawOval(220, 95, 30, 20);
    g.drawLine(175, 105, 220, 105);
    g.drawLine(145, 105, 100, 90);
    g.drawLine(250, 105, 290, 90);
    //New Color - Nose
    g.setColor(Color.BLACK);
    g.fillOval(180, 140, 30, 40);
    //New Color - Mouth
    g.setColor(Color.RED);
    g.drawArc(130, 160, 100, 50, 160, 180);
    //New Color - Text
    g.drawString("The Mad Doctor", 40, 250);
    //New Color - Hair
    g.setColor(Color.BLACK);
    g.drawLine(180, 50, 180, 15);
    g.drawLine(185, 50, 185, 15);
    g.drawLine(190, 50, 190, 15);
    g.drawLine(195, 50, 195, 15);
    g.drawLine(200, 50, 200, 15); //--middle
    g.drawLine(205, 50, 205, 15);
    g.drawLine(210, 50, 210, 15);
    g.drawLine(215, 50, 215, 15);
    g.drawLine(220, 50, 220, 15);
    
    
  //  g.drawOval(100, 50, 200, 200);
  //  g.setColor(Color.yellow);
   // g.fillOval(100, 50 10, 20);
   // g.fillOval(155, 100, 10, 20);
   // g.fillOval(230, 100, 10, 20);
   // g.drawArc(150, 160, 100, 50, 180, 180);
  }

  public static void main(String[] arg){
    ASSN1p3 frame = new ASSN1p3();

    frame.setSize(400,400);
    frame.setVisible(true);
  }
}