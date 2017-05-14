import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Sales_Bar_Chart extends JComponent{
	int qtr1, qtr2, qtr3, qtr4;
	
	public Sales_Bar_Chart(int q1, int q2, int q3, int q4){
	this.qtr1 = q1;
	this.qtr2 = q2;
	this.qtr3 = q3;
	this.qtr4 = q4;
	}
	

		protected void paintComponent(Graphics g){
			super.paintComponents(g);
			int height = 1, start = 700;
			int total = qtr1 + qtr2+ qtr3 + qtr4;
			g.drawString("Qtr 1 $" + qtr1, 25, 775);
			g.drawString("Qtr 2 $" + qtr2, 135, 775);
			g.drawString("Qtr 3 $" + qtr3, 240, 775);
			g.drawString("Qtr 4 $" + qtr4, 355, 775);
			g.drawString("Total Sales: $" + total, 160, 800);
			g.drawLine(5, start, 445, start);
			g.setColor(Color.RED);
			g.fillRect(10, start - (height * qtr1), 100 , height * qtr1);
			g.setColor(Color.YELLOW);
			g.fillRect(120, start - (height * qtr2), 100, height * qtr2);
			g.setColor(Color.GREEN);
			g.fillRect(230, start - (height * qtr3), 100, height * qtr3);
			g.setColor(Color.ORANGE);
			g.fillRect(340, start - (height * qtr4), 100, height * qtr4);
			
			
			
	}
public static void main(String []args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the sales for quarter 1:");
	int qtr1 = (int) input.nextDouble();
	System.out.println("Please enter the sales for quarter 2:");
	int qtr2 = (int)input.nextDouble();
	System.out.println("Please enter the sales for quarter 3:");
	int qtr3 = (int)input.nextDouble();
	System.out.println("Please enter the sales for quarter 4:");
	int qtr4 = (int)input.nextDouble();
	
	
		JFrame frame = new JFrame();
		frame.setTitle("Bar_Chart");
	    frame.getContentPane().add(new Sales_Bar_Chart(qtr1, qtr2, qtr3, qtr4));
	    frame.setSize(500, 900);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
	}
}