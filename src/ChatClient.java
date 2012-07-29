import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class ChatClient extends Frame {
	Socket s = null;
	DataOutputStream dos =null;
	TextField tfTxt = new TextField();
	TextArea taContent = new TextArea();

	public static void main(String[] args) {
		new ChatClient().launchFrame();

	}

	public void launchFrame() {
		setLocation(400, 300);
		this.setSize(300, 300);

		add(tfTxt, BorderLayout.SOUTH);
		add(taContent, BorderLayout.NORTH);
		pack();
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				disconnect();
				System.exit(0);
			}
		});
		tfTxt.addActionListener(new TFListener());
		setVisible(true);
		connect();
	}

	public void connect() {
		try {
			s = new Socket("127.0.0.1", 8882);
			dos= new DataOutputStream(s.getOutputStream());
			System.out.println("connected");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void disconnect() {
		try {
			dos.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private class TFListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = tfTxt.getText().trim();
			taContent.setText(str);
			tfTxt.setText("");
			try {
				dos.writeUTF(str);
				dos.flush();
				//dos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}
}
