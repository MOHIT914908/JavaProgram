package UNIT_02;

public class P11_Task01_AccessProtectionInJava {
	public int a =10;
	public static void main(String[] args) {
	ChildClass obj =new ChildClass();
	obj.showData();
	obj.accessData();
	
	}
}

class ParentClass{
	int a=10;
	public int b=10;
	protected int c=30;
	private int d=40;
	void showData()
	{
		System.out.println("Inside ParentClass");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c= "+c);
		System.out.println("d = "+d);
	}
}

class ChildClass extends ParentClass { 
	
	void accessData() {
		System.out.println("inside ChildClass");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
		//System.out.println("d = "+d);
	}
}

class AnotherClasss{
	void display() {
		ParentClass obj= new ParentClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}