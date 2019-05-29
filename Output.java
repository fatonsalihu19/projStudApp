
import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class Output extends JPanel
{ 
	  private int w = 400;
	  private int h= 500;	  
	  private String s="";
	  private String s1="";
	  private String title="";
	//Vizatimi i Kornizes 
	  public Output() {
	    JFrame my_frame = new JFrame();

	    my_frame.getContentPane().add(this);
	    my_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    my_frame.setTitle("Student GradeBook Aplication");
	    my_frame.setSize(w, h);
	    my_frame.setVisible(true);
	  }
	  //drawString sherben per ndrjen e fjalive kur perdoret \n
	  private void drawString(Graphics g, String text, int x, int y) {
	      int lineHeight = g.getFontMetrics().getHeight();
	      for (String line : text.split("\n"))
	          g.drawString(line, x, y += lineHeight);
	      this.repaint();}
	  
	   public void paintComponent(Graphics g)
	  { super.paintComponent(g);
		  g.setColor(Color.white);
		  
	     g.fillRect(0, 0, w, h); 
	    
	    ImageIcon i = new ImageIcon("C:\\Users\\Toni\\eclipse-workspace\\ProjektiFundit\\src\\stud.png");
	    i.paintIcon(this, g, 0, 0);
	    g.setColor(Color.black);
	    g.drawString(title, 10, 140);
	   int text_margin = 180;
	    int text_baseline = 50;
	    g.drawString(s, text_margin, text_baseline);
	    drawString(g,s1, text_margin, text_baseline+5);
	  
	   
	    this.repaint();
	   
	  
	  }
	  public void show(String message)
	  { s = message;
	    this.repaint();
	 
	  }
	  public void show1(String message)
	  { s1 = message;
	    this.repaint();
	 
	  }
	  public void showtitle(String message)
	  { title = message;
	    this.repaint();
	 
	  }
	 


}
