package mypackage;

abstract class MyClass1{
	//this is abstract method
	abstract void calculate(double x);
}
class Sub1 extends MyClass1{

	//calculate Square value
	@Override
	void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("Square:"+(x*x));
	}
}
class Sub2 extends MyClass1{
	//calculate square root value
	@Override
	void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("Square root:"+Math.sqrt(x));
	}
}
class Sub3 extends MyClass1{
	//calculate cube value
	@Override
	void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("Cube:"+(x*x*x));
	}
	
}
public class Different {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create sub class objects
		Sub1 obj1=new Sub1();
		Sub2 obj2=new Sub2();
		Sub3 obj3=new Sub3();
		
		//let the objects call the calculate method
		obj1.calculate(4);
		obj2.calculate(9);
		obj3.calculate(6);
	}

}
