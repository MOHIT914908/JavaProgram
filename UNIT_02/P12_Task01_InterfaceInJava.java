package UNIT_02;

interface Animal{
	public void animalSound();
	public void run();
}
interface Human{
	public void humanSound();
	public void run();
}
public class P12_Task01_InterfaceInJava implements Animal {

	public static void main(String[] args) {
		C1 obj=new C1();
		obj.funcA();
		obj.funcB();
	}
	public void animalSound() {
		
	}
	public void run() {
		
	}
}

class Species implements Animal,Human{
	public void animalSound() {
		System.out.println("We are inside animalSound method");
	}
	public void run() {
		System.out.println("we are inside run method");
	}
	public void humanSound() {
		System.out.println("we are inside humanSound");
	}
	public void run1() {
		System.out.println("we are inside run method");
	}
}
interface A1{
	void funcA();
}
interface B1 extends A1{
	void funcB();
}
class C1 implements B1{
	public void funcA() {
		System.out.println("this ia funcA from A1");
	}


	public void funcB() {
		System.out.println("this funcB from A2");
	}
}
