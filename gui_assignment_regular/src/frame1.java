
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;  

import java.awt.event.MouseMotionListener; 
import java.awt.*;

import java.awt.event.*;
import java.awt.geom.*;



public class frame1 extends JFrame implements MouseMotionListener, MouseListener{

	String box=JOptionPane.showInputDialog("Enter number of sides for the regular polygon :");
	
	int side=Integer.parseInt(box);

	String box3=JOptionPane.showInputDialog("Enter the number of the color for the line of the polygon :\n1.Red\n2.Blue\n3.Green\n4.Orange\n5.Magenta\n6.Black\n7.Cyan\n8.DarkGray\n9.Pink\n10.None");
	
	int num3=Integer.parseInt(box3);
	
	String box4=JOptionPane.showInputDialog("Enter number of the color to fill the polygon :\n1.Red\n2.Blue\n3.Green\n4.Orange\n5.Magenta\n6.Black\n7.Cyan\n8.DarkGray\n9.Pink\n10.None");
	
	int num4=Integer.parseInt(box4);

    private int  x1= 0, y1 = 0;
   
    frame1(){

        this.setTitle("Draw regular");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setResizable(false);
        this.setSize(1500, 1000);
       
        addMouseListener(this);
        //addMouseMotionListener(this);  
        
        
       
        //this.add(jp);
        this.setVisible(true);
    }
    
    
    public void mouseReleased(MouseEvent e ) { 
        int x2= e.getX(), y2 = e.getY();
        Graphics ga = getGraphics();
        
        //line color
        
        //line color
        
        if (num3==1){
        	ga.setColor(Color.red);  
        }
        else if(num3==2) {
        	ga.setColor(Color.blue);
        }
        else if(num3==3) {
        	ga.setColor(Color.green);
        }
        else if(num3==4) {
        	ga.setColor(Color.orange);
        }
        else if(num3==5) {
        	ga.setColor(Color.magenta);
        }
        else if(num3==6) {
        	ga.setColor(Color.black);
        }
        else if(num3==7) {
        	ga.setColor(Color.cyan);
        }
        else if(num3==8) {
        	ga.setColor(Color.darkGray);
        }
        else if(num3==9) {
        	ga.setColor(Color.pink);
        }
        else if(num3==10) {

        }
        


        int x, y, cx, cy, dx, dy, r, n = side;
		//CALCULATE DISPLACEMENT OF X AND Y TO FIND RADIUS OF OUTER CIRCLE
		dx = x2 - x1;
		dy = y2 - y1;
		
		//CALCULATE RADIUS BY CALCULATING DIAMETER AND DIVIDING IT BY HALF
		r = (int) Math.sqrt(Math.abs(dx*dx) + Math.abs(dy*dy))/2;
		
		cx = x2;
		cy = y2;
		
		//CREATE A NEW POLYGON OBJECT
		Polygon regPoly = new Polygon();

		//CALCULATE THE POSITION OF EACH POINT OF THE POLYGON FOUND ON THE CIRCUMFERENCE
		for(int i = 0; i < n; i++){
			x = (int) (cx + r * Math.cos(2.0 * Math.PI * i/n));
			y = (int) (cy + r * Math.sin(2.0 * Math.PI * i/n));
			regPoly.addPoint(x, y);
		}

        ga.drawPolygon(regPoly);
        
        //fill color
        
        if (num4==1){
        	ga.setColor(Color.red); 
			ga.fillPolygon(regPoly);
        }
        else if(num4==2) {
        	ga.setColor(Color.blue);
			ga.fillPolygon(regPoly);
        }
        else if(num4==3) {
        	ga.setColor(Color.green);
			ga.fillPolygon(regPoly);
        }
        else if(num4==4) {
        	ga.setColor(Color.orange);
			ga.fillPolygon(regPoly);
        }
        else if(num4==5) {
        	ga.setColor(Color.magenta);
			ga.fillPolygon(regPoly);
        }
        else if(num4==6) {
        	ga.setColor(Color.black);
			ga.fillPolygon(regPoly);
        }
        else if(num4==7) {
        	ga.setColor(Color.cyan);
			ga.fillPolygon(regPoly);
        }
        else if(num4==8) {
        	ga.setColor(Color.darkGray);
			ga.fillPolygon(regPoly);
        }
        else if(num4==9) {
        	ga.setColor(Color.pink);
			ga.fillPolygon(regPoly);
        }
        else if(num4==10) {

        }
        
    }

    
    @Override
    public void mousePressed(MouseEvent e)   { 
        x1= e.getX(); y1 = e.getY();
        
    }
  
    public void mouseClicked(MouseEvent e) { 
        

    }
    public void mouseMoved(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}

    public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
    
    
}
