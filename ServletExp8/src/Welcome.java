import java.io.*;

import java.awt.*;

import java.applet.Applet;


public class Welcome extends Applet {
	
	
public void paint(Graphics g) {

		int inset;
		
int rectWidth, rectHeight;

		g.setColor(Color.pink);

		g.fillRect(0,0,300,160);

		g.setColor(Color.green);

		inset = 0;
	
	rectWidth = 299;

		rectHeight = 159;

		while (rectWidth >= 0 && rectHeight >= 0) {

			g.drawRect(inset, inset, rectWidth, rectHeight);
	
		inset += 15;
			
rectWidth -= 30;
		
	rectHeight -= 30;
	
	}

	}
} 
