import java.io.*;


import java.net.*;

public class ChatServer {
      
	public static void main(String[] args) {
		   boolean started =false;
		try {
			ServerSocket ss = new ServerSocket(8882);
			started =true;
			while (started) {
				boolean bconnected =false;
				Socket s = ss.accept();
				System.out.println("a client connected!");
			    bconnected =true;
				DataInputStream dis = new DataInputStream(s.getInputStream());
				while(bconnected){
				String str = dis.readUTF();
				System.out.println(str);
				}
				dis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
