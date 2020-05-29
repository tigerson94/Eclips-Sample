import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ToggleExam {
	static boolean click = false;

	public static void main(String[] args) {
		JFrame j = new JFrame("Toggle");
		JButton btn = new JButton("Click!");
		btn.setBackground(Color.RED);
		j.add(btn);
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (click) {
					btn.setBackground(Color.RED);
				} else {
					btn.setBackground(Color.YELLOW);
				}
				click = !click;
			}
		});
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(400, 200);
		j.setVisible(true);
	}
}