package network;

import java.io.*;
import java.net.*;
import java.util.Calendar;

public class DateServer {
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(9100)){
			Socket socket = null;
			
			while(true) {
				try {					
					System.out.println("wait");
					
					socket = serverSocket.accept();
					System.out.println("새로운 클라이언트 접속...[" + socket.getRemoteSocketAddress() + "]");
					
					OutputStream ostream = socket.getOutputStream();
					PrintWriter writer = new PrintWriter(ostream, true);
					writer.println(Calendar.getInstance().getTime());
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					 socket.close();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
