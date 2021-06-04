package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class RemoteJson {
	   static final String JDBC_CLASS_NAME = "org.mariadb.jdbc.Driver";
	   static final String DB_URL = "jdbc:mariadb://localhost:3306/OOP";
	   static final String DB_USER = "root";
	   static final String DB_PASSWORD = "rhksflwk";
	public static void main(String[] args) throws Exception{
		String site = "https://jsonplaceholder.typicode.com/posts";
		URL url = new URL(site);
		
		URLConnection con = url.openConnection();
		
		InputStream stream = con.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
		
		String line=null;
		String str = "";
		
		while((line = bufferedReader.readLine())!= null) {
			str += line;
		}
		
		Gson gson = new Gson();
		
		Post [] postAr = gson.fromJson(str, Post[].class);
		List<Post> posts = Arrays.asList(postAr); 
		
//		List<Post> posts = gson.fromJson(str, new TypeToken<List<Post>>(){}.getType());
		for(Post post : posts) {
			insertIntoDB(post);
		}
	}
	static public void insertIntoDB(Post post) {
      try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);) {
          String sql = "insert into posts(userId, id, title, body) values(?, ?, ? , ?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, post.getUserId());
          ps.setInt(2, post.getId());
          ps.setString(3, post.getTitle());
          ps.setString(4, post.getBody());
          ps.executeUpdate();
          
          System.out.println("success");
       } catch (SQLException e) {
          System.out.println(e.getMessage());
       }
		
	}
}