package classes;

class Person {
		
		//ATTRIBUTES
	    public String name;
	    public int age;
	    
	    //CONSTRUCTORS
	    public Person(String name,int age) {
	    	this.name = name;
	    	this.age = age;
	    }
	    public Person(String name) { //overload
	    	this.name = name;
	    }

	    //METHODS
	    public String getName(){
	        return this.name;
	    }

}
	


/************************MAIN*********************/
public class user{
	
    public static void main(String args[]){
         Person obj = new Person("Mario");
         System.out.println("Name: " + obj.getName()); 
    } 
}

