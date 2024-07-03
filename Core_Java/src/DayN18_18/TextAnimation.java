package DayN18_18;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
public class TextAnimation extends Frame implements Runnable 
{
	Thread t1,t2,t3;
	int x1,y1,x2,y2;
	
	public TextAnimation() 
	{
		t1 = new Thread(this);
		t2 = new Thread(this);
		t3 = new Thread(this);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		x1 = 50;
		x2 = 500;
		y1 = 100;
		y2 = 150;
	}
	
	@Override
	public void paint(Graphics g) 
	{
		Font f = new Font("Arial", Font.BOLD, 30);
		g.setFont(f);
		
		g.setColor(Color.MAGENTA);
		g.drawString("SEED Infotech", x1, y1);
		
		g.setColor(Color.BLUE);
		g.drawString("Pune INDIA", x2, y2);
	}
	
	@Override
	public void run() 
	{
	
		try 
		{
			for(int i=0;i<600;i++)
			{
				x1++;
				x2--;
				Thread.sleep(20);
				repaint();
			}
			
		}
	   catch(InterruptedException e) 
	   {
			e.printStackTrace();
	   }
	}
	
	public static void main(String[] args) 
	{
		Frame f = new TextAnimation();
		f.setTitle("Text Animation");
		f.setSize(700, 500);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
