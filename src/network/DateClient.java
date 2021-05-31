package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DateClient {
	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 9100)){
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = reader.readLine();
			System.out.println(line);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
