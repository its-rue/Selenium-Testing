package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};              //static array
		System.out.println("print 2 multiple");
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				//break;                                 //stops the code
			}
			else {
				System.out.println(arr[i] + "is not multiple of 2");
			}
			
			}
		
		System.out.println("ARRAY LIST");
		
		ArrayList<String> a = new ArrayList<String>();
		//create object of the class - object.method   //to access the method we create object
		a.add("shrutika");
		a.add("shinde");
		a.add("java");
		a.add("selenium");
		//a.remove(3);        //removes
		System.out.println(a.get(1));
		
		System.out.println("LOOPS");
		
		for(int i = 0 ; i<a.size() ; i++ ) {
			System.out.println(a.get(i));
		}
		
		System.out.println("ENHANCED LOOP");
		
		for(String val: a) {
			System.out.println(val);
		}
		
		//to check item present in arraylist
		System.out.println(a.contains("java"));
		
		//convert array to arraylist
		String[] name = {"shrutika","loves","mogumogu"};
        List<ArrayList<String>> nameArrayList = Arrays.asList(a);  
        nameArrayList.contains("selenium");
        
	}

}
