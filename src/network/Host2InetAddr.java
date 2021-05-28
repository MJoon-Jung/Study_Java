package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Host2InetAddr {
	
	public static void main(String[] args) {
		String hostName = "www.naver.com";
		
		try {
			InetAddress adress = InetAddress.getByName(hostName);
			System.out.println("IP аж╪р : " + adress.getHostAddress());
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
