class BlockTest{
	static {
		System.out.println("static {}");
	}
	{
		System.out.println("{}");
	}
	
	public BlockTest() {
		System.out.println("»ý¼ºÀÚ");
	}
	
	public static void main(String[] args) {
		
		BlockTest bt =new BlockTest();
		
		BlockTest bt2 = new BlockTest();
		
	}
}
