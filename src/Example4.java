
public class Example4 {//class starts

	public static void main(String[] args) {//main method starts -built-in method
		String st1="Deeptech Lab";//initialize the variable and assign in some input 
		String s[]=st1.split("e",3);//create one string type of array using split method
		for(String output:s)//using for loop s data to output transfered
		System.out.println(output);//print statement display output
		System.out.println(st1.replace('e', 'a'));//print statement for replace method
		System.out.println(st1.contains("hello"));//print statement for contains method
	}//main method ends

}//class ends
