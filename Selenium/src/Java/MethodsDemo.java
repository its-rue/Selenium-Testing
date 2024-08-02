package Java;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		getData2();
		System.out.println(name);
		
		MethodsDemo2 m = new MethodsDemo2();
		m.getUserData();

	}
	
	public String getData() {              //static keyword gives method class level access
		System.out.println("hello world");
		return "0";
	}
	
	public static String getData2() {              //static keyword gives method class level access, without object
		System.out.println("hello world");
		return "0";
	}

}
