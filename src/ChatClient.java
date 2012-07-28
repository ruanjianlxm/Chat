import java.awt.*;
import java.awt.event.*;

public class ChatClient extends Frame {
	
	TextField tfTxt = new TextField();
	TextArea taContent = new TextArea();
	
	public static void main(String[] args) {
	new ChatClient().launchFrame();
	
	}
    public void launchFrame(){
	   setLocation(400,300);
	   this.setSize(300,300);
	   
	   add(tfTxt,BorderLayout.SOUTH);
	   add(taContent,BorderLayout.NORTH);
	   pack();
	   this.addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);}});
	   tfTxt.addActionListener(new TFlistener());
	   setVisible(true);
			
		}
    private class TFlistener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = tfTxt.getText().trim();
			taContent.setText(s);
			tfTxt.setText("");
			
		}
		
	}
	}


