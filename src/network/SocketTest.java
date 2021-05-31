package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketTest {
	public static void main(String[] args) {
		try (Socket socket = new Socket("time-c.nist.gov",13)){
			InputStream inStream = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			socket.close();
			System.out.println("exit");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
