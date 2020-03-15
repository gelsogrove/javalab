package privatepublic;

class TestClass{  
	public double num = 100;
	public int square(int a){
		return a*a;
	}
}


/************************MAIN*********************/
public class examplePublic{
	public static void main(String args[]){  
		TestClass obj = new TestClass();  
		System.out.println(obj.num); 
		System.out.println(obj.square(10));
	}  
}