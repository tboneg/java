////////////////////////////////////////////////////////////////////////////
//
// Tristan Goers
// Assignment 2, PART 2
// October 3, 2016
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// DESCRIPTION: Finds altered pixel values and changes the RGB values to make the vixel distinguishable
//
// INPUTS: secretimage.png
//
// OUTPUTS: output.png --> image with altered pixels visable
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class ASSN2p2 extends JFrame
{
private static BufferedImage image = null; 
public void paint(Graphics g)
{
super.paint(g);
g.drawImage( image, 5, 35, null); 
}
public ASSN2p2()
{
setSize(300, 200);
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
//-----------------------------------------------------------

public static void main(String[] args) throws Exception
{
ASSN2p2 myWindow = new ASSN2p2();

File input = new File("D:\\2016-2017\\Fall2016\\201_CSCE_Programming\\Assignment 2\\ASSNp2\\secretmessage.png");
image = ImageIO.read(input);

for (int y = 0; y < image.getHeight(); y++)
{
 for (int x = 0; x < image.getWidth(); x++)
 {
int pixel = image.getRGB(x, y);
Color c = new Color(pixel);
 int r,g,b;
 //int a;
 //r = getRed(pixel);
 //g = getGreen(pixel);
 //b = getBlue(pixel);
 //a = getAlpha(pixel);
 
 r = c.getRed();
 g = c.getGreen();
 b = c.getBlue();
 
if ((r == 5) && (g == 64) && (b == 5))
{
r = 255;
b = 255;
b = 255;
//a = 100;
//image.setRGB(x,y,makeRGBColor(r,g,b));

c = new Color(r,g,b);
image.setRGB(x,y,c.getRGB());
} }
}




myWindow.repaint();
}
}