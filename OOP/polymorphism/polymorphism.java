package polymorphism;


class Animal{
   public void sound(){
      System.out.println("Animal is making a sound");   
   }
}

class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
}

/************************MAIN*********************/
public class polymorphism {
	public static void main(String[] args) {
		Animal obj = new Horse();
		obj.sound();
	}
}
