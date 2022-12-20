package org.tnsindia.ThreadDemo;

class parent
{
	public void squareNum() throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000); 
			System.out.println("Squares of the numbers :"+(i*i));
		}
	}
}
class child
{
	public void doublenum() throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000); 
			System.out.println("Squares of the numbers :"+(i*2));
		}
	}
}
//In Single thread process at the one time one process execute
//Driver Class
public class SingleThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main method.....");
		parent p=new parent();
		child c=new child();
		p.squareNum();
		c.doublenum();
		

	}

}