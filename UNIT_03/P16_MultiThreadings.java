package UNIT_03;
/*task in user hand
 * 1.identify dependent and non dependent task in respective process 
 * 2.insert selective task into threads 
 * 3.start those threads 
 */
import java.util.Scanner;

public class P16_MultiThreadings {


	public static void main(String[] args) {
	/*	c1 obj1=new c1();
		c2 obj2=new c2();
		obj1.show1();
		obj2.show2();
	}*/
	 Thread T1=new Thread(new T1(),"c");
	 Thread T2=new Thread(new T2(),"java");
	 Thread T3=new Thread(new T3(),"c++");
	 T1.start();
	 T2.start();
	 T3.start();
	}
}
class T1 extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println(r);
		System.out.println(Thread.currentThread().getName());
		}
}
class T2 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			//System.out.println("hey_2");
		}
	}
}
class T3 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
/*
class c1{
	void show1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int r=sc.nextInt();
		System.out.println(r);
		}
}
class c2{
	void show2()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hey_2");
		}
	}
}*/
