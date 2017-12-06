import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main (String [] args) {
		ServerSocket server;
		try {
			server = new ServerSocket(8030);
			Socket socket = server.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
