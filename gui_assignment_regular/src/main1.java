import javax.swing.JOptionPane;

public class main1{
    public static void main(String[] args) {
    	
    	String boxChoice=JOptionPane.showInputDialog("Enter number 1 to draw regular polygons.\nEnter number 2 to draw irregular polygons. ");

    	int choice=Integer.parseInt(boxChoice);
    	
    	if(choice==1) {
    		
    		new frame1();
    	}
    	else if(choice==2) {
    		
    		new Polygons();
    	}
    	else {
    		
    		System.out.print("Enter number 1 or number 2 only!!!");
    		
    	}
        
    }
}