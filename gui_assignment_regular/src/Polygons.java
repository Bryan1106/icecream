
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;



public class Polygons extends JFrame implements MouseListener{
	
	public int x2,y2;
	
	
String box=JOptionPane.showInputDialog("Enter number of sides for the irregular polygon :");

int side=Integer.parseInt(box);

String box1=JOptionPane.showInputDialog("Enter the number of the color for the line of the polygon :\n1.Red\n2.Blue\n3.Green\n4.Orange\n5.Magenta\n6.Black\n7.Cyan\n8.DarkGray\n9.Pink\n10.None");

int num1=Integer.parseInt(box1);

String box2=JOptionPane.showInputDialog("Enter number of the color to fill the polygon :\n1.Red\n2.Blue\n3.Green\n4.Orange\n5.Magenta\n6.Black\n7.Cyan\n8.DarkGray\n9.Pink\n10.None");

int num2=Integer.parseInt(box2);
	

	
    private int[] X, Y;
    private int index =0;

    Polygons(){
        this.setTitle("Draw regular");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setResizable(false);
        this.setSize(1500, 1000);
       
        addMouseListener(this);
        
        X = new int[side];
        Y = new int[side];
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Polygons();
    }

    public void mouseReleased(MouseEvent e ) { 
        x2= e.getX();
        y2 = e.getY();
        
    	Graphics g=getGraphics();  
        g.setColor(Color.red);  
        g.fillOval(x2,y2,10,10);
    }

    @Override
    public void mousePressed(MouseEvent e)   { 

    }
  
    public void mouseClicked(MouseEvent e) { 

        X[index] = e.getX();
        Y[index] = e.getY();
        ++index;
      
        if (index == side ){
            index = 0;
            Polygon irregular = new Polygon();

            for (int i =0 ; i < side; ++i){
                irregular.addPoint(X[i], Y[i]);
            }

            Graphics ga = getGraphics();
            //line color
            
            if (num1==1){
            	ga.setColor(Color.red);  
            }
            else if(num1==2) {
            	ga.setColor(Color.blue);
            }
            else if(num1==3) {
            	ga.setColor(Color.green);
            }
            else if(num1==4) {
            	ga.setColor(Color.orange);
            }
            else if(num1==5) {
            	ga.setColor(Color.magenta);
            }
            else if(num1==6) {
            	ga.setColor(Color.black);
            }
            else if(num1==7) {
            	ga.setColor(Color.cyan);
            }
            else if(num1==8) {
            	ga.setColor(Color.darkGray);
            }
            else if(num1==9) {
            	ga.setColor(Color.pink);
            }
            else if(num1==10) {

            }
            
            ga.drawPolygon(irregular);

          //fill color
            
			
	            if (num2==1){
	            	ga.setColor(Color.red); 
					ga.fillPolygon(irregular);
	            }
	            else if(num2==2) {
	            	ga.setColor(Color.blue);
					ga.fillPolygon(irregular);
	            }
	            else if(num2==3) {
	            	ga.setColor(Color.green);
					ga.fillPolygon(irregular);
	            }
	            else if(num2==4) {
	            	ga.setColor(Color.orange);
					ga.fillPolygon(irregular);
	            }
	            else if(num2==5) {
	            	ga.setColor(Color.magenta);
					ga.fillPolygon(irregular);
	            }
	            else if(num2==6) {
	            	ga.setColor(Color.black);
					ga.fillPolygon(irregular);
	            }
	            else if(num2==7) {
	            	ga.setColor(Color.cyan);
					ga.fillPolygon(irregular);
	            }
	            else if(num2==8) {
	            	ga.setColor(Color.darkGray);
					ga.fillPolygon(irregular);
	            }
	            else if(num2==9) {
	            	ga.setColor(Color.pink);
					ga.fillPolygon(irregular);
	            }
	            else if(num2==10) {

	            }
            
        }

    }
    public void mouseMoved(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}

    public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
}