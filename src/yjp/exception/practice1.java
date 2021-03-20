package yjp.exception;

public class practice1 {
	public static void main(String[] args) {
		String id = "g";
		String psd = "1";
		
		try {
			login(id,psd);
			System.out.println("Welcome");
		}catch(LoginException e) {
			if(e.getErrorCode() == 0) {				
				System.out.println("id error");
			}else if(e.getErrorCode() == 1) {
				System.out.println("password error");
			}else if(e.getErrorCode() == 2) {
				System.out.println("id, password error");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
			
//		} catch (Exception e) {
//			System.out.println(e.getMessage() + " " );
//			System.out.println("Retry");
//		}
	}
	private static void login(String id,String psd) throws LoginException {
		checkDB(id,psd);
		
		
		
//		try {
//			checkDB(id,psd);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//			throw new LoginException("login fail");
//		}
		
		
	}
	private static void checkDB(String id,String psd) throws LoginException {
		String [] errMsg = {"ID Error", "Password Error", "error"};
		int errorCode = -1;
		if(!id.equals("gg")) {
			errorCode = 0;
//			throw new LoginException("ID ERROR",1);
		}else if(!psd.equals("11")) {
			errorCode = 1;
//			throw new LoginException("Password Error",2);
		}if(!id.equals("gg") && !psd.equals("11")) { 
			errorCode = 2;
//			throw new LoginException("id , password error", 3);
		}else {
			System.out.println("Login Success");
		}
		throw new LoginException(errMsg[errorCode],errorCode);
	}
}
