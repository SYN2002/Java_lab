class A35{
	A35(){
		System.out.println("Constructor");
	}
	{
		System.out.println("Instance");
	}
	static{
		System.out.println("Static A");
	}
	public static void main(String args[]){
		new A35();
	}
}
