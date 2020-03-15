package interfacetest;

interface MyInterface
{
   public void method1();
   public void method2();
}


class Demo implements MyInterface
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}


}


/************************MAIN*********************/
public class example1{
	public static void main(String args[]){  
		MyInterface obj = new Demo();
		obj.method1();
	}  
}

