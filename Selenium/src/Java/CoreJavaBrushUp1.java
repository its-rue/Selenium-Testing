package Java;

public class CoreJavaBrushUp1 {
	
	public static void main(String[]args) {
	
	int myNum = 5;
	String website = "shrutika";
	char letter = 'r';
	double dec = 5.99;
	boolean myCard = true;
	
	System.out.println(myNum + "is the value stored in the myNum variable");
	System.out.println(website);
	
	System.out.println("ARRAYS");
	
	//Arrays
	int[] arr = new int[5];   //5,10
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	arr[3] = 4;
	arr[4] = 5;
	System.out.println(arr[1]);
	
	int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
	System.out.println(arr2[3]);
	
	System.out.println("FOR LOOP");
	
	//for loop
	System.out.println("array 1");
	for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("array 2");
	for(int i = 0; i<arr2.length ; i++) {
		System.out.println(arr2[i]);
	}
	
	System.out.println("array 3");
	String[] name = {"shrutika","shinde"};
	for(int i=0; i<name.length; i++) {
		System.out.println(name[i]);
	}
	
	System.out.println("enhanced array");
	for(String s : name) {                                //enhanced for loop for(datatype variable : array)
		System.out.println(s);
	}
	
	}
}
