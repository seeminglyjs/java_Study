package IP.ServerSocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class mainCl {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("Connecting request");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("Connecting Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
