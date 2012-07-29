import java.io.*;


import java.net.*;

public class ChatServer {
      
	public static void main(String[] args) {
		   boolean started =false;
		   ServerSocket ss=null;
		   Socket s = null;
		   DataInputStream dis =null;
		try {
			 ss= new ServerSocket(8882);
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		try{
			
			started =true;
			while (started) {
				boolean bconnected =false;
				s = ss.accept();
				System.out.println("a client connected!");
			    bconnected =true;
				dis = new DataInputStream(s.getInputStream());
				while(bconnected){
				String str = dis.readUTF();
				System.out.println(str);
				}
		
			}
			
			
		} 
		
		
		catch (EOFException e) {
			// TODO: handle exception
			System.out.println("client closed");
		}
		catch (Exception e) {
			e.printStackTrace();
	
			//e.printStackTrace();
		
		}
		
		finally{
			try {
				if(dis!=null)
				dis.close();
				if(s!=null)
				s.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}

}
