package supertest;


class Parentclass
{
	
	Parentclass(int num) {
		System.out.println("Constructor of parent class");
	}
}


class Subclass extends Parentclass
{
	//CONSTRUCTOR
	public Subclass(int num){
		super(num);  
	}
	
	//METHOD
	public void display(){
		System.out.println("Hello!");
	}
}

/************************MAIN*********************/
public class example1{

	public static void main(String args[]){  

		Subclass obj2= new Subclass(10);
		obj2.display();
	}  	   
}

