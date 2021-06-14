package Hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
public class HooksExample {
	//order is quite similar to TestNG priority keyword 
	//used in hooks before and after tags to denote the priority of the tag if similar tag exists
	//@Before tag executes priority in ascending order(0,1,2,3....)
	//@After tag executes priority in descending order(....3,2,1,0)
	
	@Before(order=0)
	public void beforetheclass() {
		System.out.println("BruceWayne parents are killed by a robber");
	}
	
	@After(order=0)
	public void aftertheclass() {
		System.out.println("Batman saves the city from Ragagul daughter");
	}
	
	@Before(order=1)
	public void beforeclass() {
		System.out.println("BruceWayne taken martials arts practice from RasaGul");
	}
		
	
	@After(order=1)
	public void afterclass() {
		System.out.println("Ragagul daughter takes revenge on brucewayne");
	}
	
}
