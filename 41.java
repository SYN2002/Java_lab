class A1{    
	A1(){
		System.out.println("Parent Constructor");
	}    
	static {
		System.out.println("Parent static block");    
	}    
	{
		System.out.println("Parent initialisation  block");
	}
}
class B1 extends A1{    
	{
		System.out.println("Child initialisation block");
    	}
    	static {
        		System.out.println("Child static block");
    	}

    	B1(){
        		System.out.println("Child Constructor");
   	}    
}
class A41{
	public static void main(String[] args){
		new B1();    
		new A1();
	}
}