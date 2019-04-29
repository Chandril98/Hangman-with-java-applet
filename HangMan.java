 import java.applet.*;
 import java.awt.*;
 import java.awt.Graphics.*;
 import java.awt.event.*;
 
 
  public class HangMan extends Applet implements ActionListener
  {      
        
		//Button B1;
	 public void init()
	 
	  { 
	    //HangMan C1=new HangMan(); 
        //B1=new Button( "Draw" );
		//B1.setBounds (50,200,50,20);
        
		//add(B1);
		//add(C1);

        //B1.addActionListener(this);	
        //C1.addActionListener(this);
		Label L1= new Label("Player 1:");
	    Label L2= new Label("Player 2:");
		
		TextField T1=new TextField();
	    TextField T2=new TextField();
		
		add(L1);
		add(T1);
		add(L2);
		add(T2);

         
		
	  }
	  
	  public void paint(Graphics g) 
	  {
		  g.drawRect (130,170,50,70); // base
		  
		  g.drawLine (150,20,150,170);// pole
		  
		  g.drawLine (45,20,150,20); // beam
		  
		  g.drawLine (45,20,45,50); //rope
		  
		  g.drawOval (30,50,30,30); //head
	     
		 g.drawLine (45,80,45,100); // neck
		  
		  g.drawLine (45,100,30,110); // left arm
		  
		  g.drawLine (45,100,60,110); // right srrm
		  
		  g.drawLine (45,80,45,150); //body
		  
		  g.drawLine (45,150,30,170); // left leg 
		  
		  g.drawLine (45,150,60,170); //right leg
	  }
	  
	  public void actionPerformed (ActionEvent e)
	  {
		  repaint();
		  
	  }
	  
	 
  }