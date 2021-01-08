package net.koreate.test;

import org.junit.Before;
import org.junit.Test;

public class JUnitTest {
	
	@Before
	public void testBefore() {
		System.out.println("before !");
	}
	
	@Test
	public void testPerfom() {
		System.out.println("test 실행");
	}
	
	@Test
	public void errorTest() {
		Integer.parseInt("1이요");
		System.out.println("hello error test");
	}
	
	
	
}
