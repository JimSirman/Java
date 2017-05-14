import java.awt.*;
import javax.swing.*;


class Slice{
  double value;
  Color color;

  public Slice(double value, Color color) {
    this.value = value;
    this.color = color;
  }
}

class Pie_Chart extends JComponent {
	
//Object array to hold the number of pieces(size and color)
  Slice[] pieces = { new Slice(20, Color.red), new Slice(10, Color.blue),
      new Slice(30, Color.green), new Slice(40, Color.orange) };

 //override paintComponent 
  protected void paintComponent(Graphics g) {
    drawPie((Graphics) g, getBounds(), pieces);
  }

  //draw my pie
  void drawPie(Graphics g, Rectangle area, Slice[] pieces) {
    double total = 0.0;
    for (int i = 0; i < pieces.length; i++) {
      total += pieces[i].value;
    }
    
    double curValue = 0.0;
    int startAngle = 0;
    for (int i = 0; i < pieces.length; i++) {
      startAngle = (int) (curValue * 360 / total);
      int arcAngle = (int) (pieces[i].value * 360 / total);
      
      g.setColor(pieces[i].color);
      g.fillArc(area.x, area.y, area.width, area.height, startAngle, arcAngle);
      curValue += pieces[i].value;
      g.setColor(Color.BLACK);
      g.drawString("Midterm 30%", 40, 225);
      g.drawString("Quizzes 10%", 200, 40);
      g.drawString("Projects 20%", 350, 150);
      g.drawString("Final 40%", 275, 350);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new Pie_Chart());
    frame.setTitle("Pie_Chart");
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setResizable(false);
    

  }
}

