
public class Example2 {//class starts

	public static void main(String[] args) {//main method starts here built-in method
		String s1="ganesh";//initialize and declare the element of s1
		String s2="ganesh";//initialize and declare the element of s2

		if(s1.equals(s2))//compare object values.input of s1 and s2
		{
			System.out.println("true");//print statement
		}
		else
		{
			System.out.println("False");//print statement
		}
		
		if(s1.equalsIgnoreCase(s2))//compare s1 and s2 using case-sensitive 
		{
			System.out.println("true");///print statement
		}
		else
		{
			System.out.println("false");//print statement
		}
		if(s1==s2)//compare the address of an object
		{
			System.out.println("true");//print statement
		}
		else
		{
			System.out.println("false");//print statement
		}
	}//main method ends

}//class ends
