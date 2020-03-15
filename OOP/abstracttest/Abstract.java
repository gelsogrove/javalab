package abstracttest;

/*****************************************************ABSTRACT Example ****************************** */
//https://www.programcreek.com/wp-content/uploads/2009/02/overloading-vs-overriding.png


abstract class Animal {
	public abstract void sound();
}

class Dog extends Animal{
	public void sound(){
		System.out.println("Woof");
	}
} 

class Cat extends Animal{
	public void sound(){
		System.out.println("Woof");
	}
}



/************************MAIN*********************/
public class Abstract {
	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.sound();	
	}
}
