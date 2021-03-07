package com.testingshastra.listenerdemo;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({com.testingshastra.coustomlisterner.ListenerToClass.class})
public class ListenerClasstTest {
	@Test
	public void testcase01() {
		System.out.println(" i am  first test case");
		Assert.assertEquals(1, 1);
	}

	@Test
	public void testcase02() {
		System.out.println("i am  second test case");
		Assert.assertEquals(1, 0);

	}

	@Test
	public void testcase03() throws InterruptedException {
		System.out.println("i am third test case");
		Thread.sleep(3000);
		Assert.assertEquals(1, 0);

	}	
	
	
	
	
	
	
	
	
	
	
	/*
	@Test
	public void testcase04() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("i am fourth test case");
		Assert.assertEquals(1, 0);
	}

	@Test
	public void testcase5() {
		System.out.println("i am fifth test case");
		Assert.assertEquals(1, 1);
	}
	/*@Listeners({com.testingshastra.coustomlisterner.ListenerToClass.class})
	public class listener1

	{
		@Test
		public void testcase01() {
			System.out.println(" i am  first test case");
			Assert.assertEquals(1, 1);
		}

		@Test
		public void testcase002() {
			System.out.println("i am  second test case");
			Assert.assertEquals(1, 0);

		}
		
	}*/
}
