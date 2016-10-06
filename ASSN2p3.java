////////////////////////////////////////////////////////////////////////////
//
// Tristan Goers
// Assignment 2, PART 2
// October 6, 2016
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// DESCRIPTION: This program will change pixel values in a selected area
//
// INPUTS: Image: redeye_incorrect_lg.jpg, r,g,b values
//
// OUTPUTS: image that has certain pixels change colors. In this case, the red eyes.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class ASSN2p3 extends JFrame
{
private static BufferedImage image = null;
public void paint(Graphics g)
{
super.paint(g);
g.drawImage( image, 5, 35, null);
}
public ASSN2p3()
{
setSize(380, 440);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
}

private static int makeRGBColor(int red, int green, int blue)
{
int rgb = 0;
rgb = red*65536 + green*256 + blue;
return rgb;
}
private static int getRed(int pixel)
{
return (pixel >> 16) & 0xFF;
}
private static int getGreen(int pixel)
{
return (pixel >> 8) & 0xFF;
}
private static int getBlue(int pixel)
{
return (pixel) & 0xFF;
}

public static void main(String[] args) throws Exception
{
ASSN2p3 myWindow = new ASSN2p3();
File input = new File("D:\\2016-2017\\Fall2016\\201_CSCE_Programming\\Assignment 2\\ASSN2p3\\redeye_incorrect_lg.jpg");
image = ImageIO.read(input);


for (int y = 169; y < 185; y++)
{
 for (int x = 133; x < 149; x++)
 {

int pixel = image.getRGB(x, y);
 int r,g,b;
 //r = getRed(pixel);
 g = getGreen(pixel);
 b = getBlue(pixel);
 r= (g + b) / 2;
 
image.setRGB(x,y,makeRGBColor(r,g,b));

 }
   }

for (int a = 143; a < 157; a++)
{
 for (int d = 256; d < 270; d++)
 {
int pixel2 = image.getRGB(d, a);
 int r,g,b;
 //r = getRed(pixel2);
 g = getGreen(pixel2);
 b = getBlue(pixel2);
 r= (g + b) / 2;
image.setRGB(d,a,makeRGBColor(r,g,b));

 }
} 




myWindow.repaint();
}
}