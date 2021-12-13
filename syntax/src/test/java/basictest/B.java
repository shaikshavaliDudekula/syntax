package basictest;


import org.testng.annotations.Test;

public class B extends A {


		@Test
		public void run() 
		{
			A c=new A();
			c.openbrowser();
			c.login();

		}	


}




