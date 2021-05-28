package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			//1. URL ��ü�� ����
			URL site = new URL("https://www.naver.com");
			
			//2 ���� ����
			URLConnection con = site.openConnection();
			
			//3 ����κ��� ��Ʈ���� ������
			InputStream stream = con.getInputStream();
			InputStreamReader streamReader = new InputStreamReader(stream);
			
			reader = new BufferedReader(streamReader);
			
			String line = "";
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader != null) reader.close();
			}catch(Exception ignore) {}
		}
	}
}
