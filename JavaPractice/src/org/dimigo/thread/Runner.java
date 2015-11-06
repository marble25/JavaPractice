package org.dimigo.thread;

public class Runner extends Thread{
	private String name;

	public Runner()
	{
		
	}
	public Runner(String name) 
	{
		this.name = name;
	}
	
	public void run()
	{
		System.out.println(name+" 출발");
		try 
		{
			for(int i=100;i>=0;i-=10)
			{
				System.out.println(name+" "+i+" 미터");
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name+" 골인");
	}
	
}
