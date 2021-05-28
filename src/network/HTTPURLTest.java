package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPURLTest {
	public static void main(String[] args) throws Exception{
		String site= "https://www.google.com/search?q=java";
		URL url = new URL(site);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");
		con.addRequestProperty("User-Agent", "Mozilla/5.0");
		
		int responseCode = con.getResponseCode();
		System.out.println(responseCode);
		
		BufferedReader reader =  new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
		String line;
		StringBuffer buf = new StringBuffer();
		while((line = reader.readLine()) != null) {
			buf.append(line + "\n");
		}
		reader.close();
		
		System.out.println(buf);
	}
}
