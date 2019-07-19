import java.awt.*; //Color, Dimension, FontMetrics, GradientPaint, Graphics and Graphics2D
import java.awt.event.*; //MouseEvent and MouseListener

import javax.swing.JButton;

public class Button extends JButton implements MouseListener{
	//private Color color1 = Color.WHITE, color2 = Color.LIGHT_GRAY;
	public static final Color VERY_LIGHT_GREEN = new Color(102,255,102);
	public static  final Color LIGHT_GREEN = new Color(0,255,51);
	public static final Color GREEN = new Color(0,204,0);
	public static final Color DARK_GREEN = new Color(0,102,0);
	public static final Color YELLOW = new Color(255,255,0);
	private String name;
	public Color RGB_Color1 = VERY_LIGHT_GREEN;
	public Color RGB_Color2 = DARK_GREEN;

	public Button(String name){
		super(name);
		this.name = name;
		this.setPreferredSize(new Dimension(65,53));
		this.addMouseListener(this);
	}

	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		GradientPaint gp = new GradientPaint(0, 0, RGB_Color1, 0, this.getHeight()/2, RGB_Color2, false);
		g2d.setPaint(gp);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		FontMetrics fm = g2d.getFontMetrics();
		int height = fm.getHeight();
		int width = fm.stringWidth(this.name);
		g2d.setColor(Color.BLACK);
		g2d.drawString(this.name, this.getWidth()/2 - width/2, this.getHeight()/2 + height/4);
		
	}
	
	public void setColors(Color RGB_Color1, Color RGB_Color2){
		this.RGB_Color1 = RGB_Color1;
		this.RGB_Color2 = RGB_Color2;
	}
	
	public void mouseClicked(MouseEvent e) { }

	public void mousePressed(MouseEvent e) {
		this.setColors(YELLOW, YELLOW);
	}

	public void mouseReleased(MouseEvent e) {
		if((e.getY()>0 && e.getY()<this.getHeight()) && (e.getX()>0 && e.getX()<this.getWidth()))
			this.setColors(VERY_LIGHT_GREEN, GREEN);
		else
			this.setColors(LIGHT_GREEN, DARK_GREEN);
	}

	public void mouseEntered(MouseEvent e) {
		this.setColors(VERY_LIGHT_GREEN, Color.GREEN);
	}

	public void mouseExited(MouseEvent e) {
		this.setColors(LIGHT_GREEN, DARK_GREEN);
	}
}
