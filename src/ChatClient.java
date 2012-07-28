import java.awt.*;
import java.awt.event.*;

public class ChatClient extends Frame {
	
	TextField tpTxt = new TextField();
	TextArea taContent = new TextArea();
	
	public static void main(String[] args) {
	new ChatClient().launchFrame();
	
	}
    public void launchFrame(){
	   setLocation(400,300);
	   this.setSize(300,300);
	   
	   add(tpTxt,BorderLayout.SOUTH);
	   add(taContent,BorderLayout.NORTH);
	   pack();
	   this.addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		   
	});
	   setVisible(true);
			
		}
	}


