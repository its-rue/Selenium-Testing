package Java;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string is an object that represents character 
	    //String Literal
	    String s = "shrutika shinde";           //1st way of storing it
	    //String ss = "shrutika shinde";          //if multiple values have value it wont create object for other
		
	    //With New Keyword
		String s1 = new String("welcome");      //2nd way of storing it
		String ss1 = new String("welcome");     //even if multiple values have same value it will create object in the memory space neither less
		
		String a = "shrutika loves mogumogu";
		String[] splittedString = a.split("loves");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
        
		System.out.println(splittedString[1].trim());   //
		
		for(int i = 0 ; i < s.length() ; i++ ) {
			System.out.println(s.charAt(i));
		}
		
		//print reverse
		for(int i = s.length()-1 ; i >= 0 ; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
