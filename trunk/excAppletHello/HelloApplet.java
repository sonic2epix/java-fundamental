import java.applet.* ;
import java.awt.* ;
public class HelloApplet extends Applet
{
	public void paint(Graphics g){
		Font font = new Font("Courier", Font.BOLD, 20);
		g.setFont(font);
		g.drawString("Hello World !", 20 , 30);
	}
}
