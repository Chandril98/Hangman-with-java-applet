 import java.applet.*;
 import java.awt.*;
 import java.awt.Graphics.*;
 import java.awt.event.*;
 
 
 public class Test extends Applet implements ActionListener
 
 
 
 {
	 
	 private boolean d1, d2, d3, d4 ;
	 Button b1 = new Button ("W");
	 Button b2 = new Button ("O");
	 Button b3 = new Button ("R");
	 Button b4 = new Button ("D");
	 //TextField t1 = new TextField();
 
  public void init()
  {
	  //add (t1);
	  add (b1);
      add (b2);
	  add (b3);  
      add (b4); 	  
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  b3.addActionListener(this);
	  b4.addActionListener(this);
  }
  
  public void paint (Graphics g)
  {
	  
	  if (d1) { g.drawOval (30,50,30,30);} //head
	  if (d2) { g.drawLine (45,80,45,100);g.drawLine(45,100,30,110);g.drawLine(45,100,60,110);} // neck,left arm , right arm
	  if (d3) { g.drawLine (45,80,45,150);}//body 
	  if (d4) { g.drawLine (45,150,60,170); g.drawLine(45,150,30,170);} //left leg, right leg
	  
	   
  }
   
   public void actionPerformed(ActionEvent e)
   {
	   
	 if(e.getSource()==b1 )
			{
				d1 = true;
				 
			}  
			
	  
	  repaint();
	  if(e.getSource()==b2 )
			{
				d2 = true;
				 
			}  
			
	  
	  repaint();
	  if(e.getSource()==b3 )
			{
				d3 = true;
				 
			}  
			
	  
	  repaint();
	  if(e.getSource()==b4 )
			{
				d4 = true;
				 
			}  
			
	  
	  repaint();
	  
	  
    }   
          
 
 
 }