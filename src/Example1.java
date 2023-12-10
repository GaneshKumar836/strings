public class Example1 {//class starts

	public static void main(String[] args) {//main method starts here built-in method
		String s1="ganesh";//initialize and declare the element of s1
		String s2="ganesh";//initialize and declare the element of s2
		String s3="Ganesh";//initialize and declare the element of s3
		System.out.println(s1.hashCode());//print statement for s1
		System.out.println(s2.hashCode());//print statement for s2
		 //s1 and s2 having same address because of same input we are given
		
		System.out.println(s3.hashCode());//print statement for s3
       //s3 create an separate address because of input is different 
		
	}//main method close

}//class ends
