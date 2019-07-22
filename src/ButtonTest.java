import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class ButtonTest extends JFrame{
	private static final Color LIGHT_GREEN = new Color(0,255,51);
	private static final Color DARK_GREEN = new Color(0,102,0);

	public ButtonTest(){
		super("JButton Customized");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		Button button = new Button("text", LIGHT_GREEN, DARK_GREEN);
		pan.add(button);
		add(pan, BorderLayout.NORTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonTest();

	}

}
