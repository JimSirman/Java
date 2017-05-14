import javax.swing.*;

import java.awt.*;

public class Bar_Chart extends JComponent{

	
		protected void paintComponent(Graphics g){
			super.paintComponents(g);
			int height = 30, start = 300;
			
			g.drawString("Project 20%", 25, 135);
			g.drawString("Quizzes 10%", 135, 135);
			g.drawString("Midterms 30%", 240, 135);
			g.drawString("Final 40%", 355, 135);
			g.drawLine(5, start, 445, start);
			g.setColor(Color.RED);
			g.fillRect(10, start - (height * 2), 100 , height * 2);
			g.setColor(Color.YELLOW);
			g.fillRect(120, start - (height * 1), 100, height * 1);
			g.setColor(Color.GREEN);
			g.fillRect(230, start - (height * 3), 100, height * 3);
			g.setColor(Color.ORANGE);
			g.fillRect(340, start - (height * 4), 100, height * 4);
			//g.fillRect(x, y, width, height);
			
		}

public static void main(String []args){
	JFrame frame = new JFrame();
	frame.setTitle("Bar_Chart");
    frame.getContentPane().add(new Bar_Chart());
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
}
}