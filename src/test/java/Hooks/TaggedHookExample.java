package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHookExample {
	@Before
	public void beforetheclass() {
		System.out.println("Executes before every scenario");
	}
	
	@After
	public void aftertheclass() {
		System.out.println("Executes after every scenario");
	}
	
	@Before("@hook1")
	public void beforefirstclass() {
		System.out.println("Executes before 1st hook tag scenario");
	}
		
	@Before("@hook2")
	public void beforesecondclass() {
		System.out.println("Executes before 2nd hook tag scenario");
	}
	
	@Before("@hook3")
	public void beforethirdclass() {
		System.out.println("Executes before 3rd hook tag scenario");
	}
		
	
	@After("@hook1")
	public void afterfirstclass() {
		System.out.println("Executes after 1st hook tag scenario");
	}
	@After("@hook2")
	public void aftersecondclass() {
		System.out.println("Executes after 2nd hook tag scenario");
	}
	@After("@hook3")
	public void afterthirdclass() {
		System.out.println("Executes after 3rd hook tag scenario");
	}
	
	@Before("@hook1 or @hook2")
	public void beforefirstandsecondclass() {
		System.out.println("Executes before 1st hook and 2nd hook tag scenario");
	}
	
	@After("@hook2 or @hook3")
	public void afterthirdandsecondclass() {
		System.out.println("Executes after 2nd hook and 3rd hook tag scenario");
	}
}
