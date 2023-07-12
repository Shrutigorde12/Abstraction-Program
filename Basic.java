/*
 package Abstraction;

abstract class animal		//	-----Abstract class --> identified by abstract keyword in front of the class 
{
	abstract String animalSound();	//	abstract class abstract method
	void diplay()					//abstract class normal method
	{
		System.out.println("Im animal from abstract class");
	}
}
class cow extends animal	//  ----Concrete class ---> who is derived base abstract class the class concrete class ,It is child class of abstract class
{
	@Override
	String animalSound() {		//overriding the abstract method
		return "Im cow -->maaaaaaa , from concrete class";
	}
	void display1()		// concrete class normal method
	{
		System.out.println("Im cow from concrete class");
	}
}
	
public class BasicAbstract {
	public static void main(String[] args) 
	{
		//animal ani=new animal();		not possible to create directly from the abstract class
		cow aa=new cow();//through concrete class only we can call abstract class
		System.out.println(aa.animalSound());	//abstract class abstract method
		aa.diplay();//abstract class normal method
		aa.display1(); //concrete class normal method
	}
}
 

 */
 package Abstraction;
 
 abstract class animal{
	 String sound="mew mew"; 
 }
 class cat extends animal{
	 
 }
public class Basic {

	public static void main(String[] args) {
		
	}

}
