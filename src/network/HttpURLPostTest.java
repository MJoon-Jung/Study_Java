package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLPostTest {
	public static void main(String[] args) {
		String site= "http://localhost:8080/board/test";
		
		try {
			URL url = new URL(site);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setDoInput(true);
			con.setDoOutput(true);
			
			con.setRequestMethod("POST");
			con.setRequestProperty("content-type", "application/x-www-form-urlencoded");
			
			String data = "id=scpark&pw=1111";
//			StringBuffer buffer = new StringBuffer();
//			buffer.append(data);
			
			OutputStream ostream = con.getOutputStream();
			//printwriter는 문자 형식을 짖어못해서 outputstreamwriter 를 먼저 생성후 printwriter에로 변환
			OutputStreamWriter owriter = new OutputStreamWriter(ostream, "UTF-8");
			PrintWriter writer = new PrintWriter(owriter);
			writer.println(data);
			writer.flush();
			
			InputStream stream = con.getInputStream();
			InputStreamReader streamReader = new InputStreamReader(stream);
			
			BufferedReader reader = new BufferedReader(streamReader);
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
