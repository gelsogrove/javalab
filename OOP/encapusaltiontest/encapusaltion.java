package encapusaltiontest;

class Person{
    private String name;
    private int age;

 
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int newValue){
        this.age = newValue;
    }

    public void setName(String newValue){
    	this.name = newValue;
    }

    
}



/************************MAIN*********************/
public class encapusaltion{
    public static void main(String args[]){
         Person obj = new Person();
         obj.setName("Mario");
         obj.setAge(32);
         System.out.println("Employee Name: " + obj.getName());
         System.out.println("Employee Age: " + obj.getAge());
    } 
}
