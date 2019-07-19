import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class ButtonTest extends JFrame{
	
	public ButtonTest(){
		super("JButton Customized");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		Button button = new Button("text");
		pan.add(button);
		add(pan, BorderLayout.NORTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonTest();

	}

}
