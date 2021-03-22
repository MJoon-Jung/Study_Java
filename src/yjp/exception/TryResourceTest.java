package yjp.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryResourceTest {
	public static void main(String[] args) {
		writeList();
	}
	public static void writeList() {
		try(MyResource mr = new MyResource()){
			System.out.println(mr.getValue());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//try �� �ȿ��� �����ϸ� �ڵ����� close�� �������༭ ���� finally �� ���� �ʾƵ� �ȴ�.
//		try (PrintWriter out = new PrintWriter("outFile.txt")){
//			for(int i = 0; i < 10; i++) {
//				out.println("num : " + i);
//			}
//			System.out.println("Complete");
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
		
		
		
//		try {
//			out = new PrintWriter("outFile.txt");
//			for(int i = 0; i < 10; i++) {
//				out.println("num : " + i);				
//			}
//			System.out.println("Complete");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
////			System.out.println(e.getMessage());
//		}finally {
//			if(out != null)
//				out.close();
//			System.out.println("close file");
//		}
		
		
		
	}
}
