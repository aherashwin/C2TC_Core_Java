
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("warrrrr");
		}
		try {
			Thread.sleep(5000);
			}
		catch(InterruptedException e) {}
		
	}
}
public class ThreadDemo  {
	public static void main(String[] arg) throws InterruptedException {
		MyThread m= new MyThread();
		m.start();
		m.join();
		for(int i=0;i<10;i++)
		{
			System.out.println("Peeeee");
		}
		
	}
}
