import java.awt.*;

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
	   setVisible(true);
			
		}
	}


